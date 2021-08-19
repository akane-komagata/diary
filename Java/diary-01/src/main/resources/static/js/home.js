/**
 * 日記の日付と日記のタイトルデータの取得
 */
window.onload = OnLinkClick();

function OnLinkClick(){
	var xmlHttpRequest = new XMLHttpRequest();
	
	xmlHttpRequest.responseType = 'json';

	xmlHttpRequest.open('GET', '/api/inquiry', true);
	
	xmlHttpRequest.send();

	xmlHttpRequest.onreadystatechange = function(){
		if(this.readyState == 4 && this.status == 200){
			diaryDate = this.response;
			const table = document.getElementById('diaryTable');
			const tbody = document.querySelector('tbody');
		
	
			diaryDate.forEach(function(data){
				let newRow = table.insertRow();
				let cellDate = newRow.insertCell();
				let newdate = document.createTextNode(data.date);
				cellDate.appendChild(newdate);
				let newTitle = document.createTextNode(data.title);
				let cellTitle = newRow.insertCell();
				cellTitle.appendChild(newTitle);
				tbody.appendChild(newRow);
			});
		}
	}
}
