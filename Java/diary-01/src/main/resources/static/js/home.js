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
			let table = document.getElementById('diaryTable');
		
	
			diaryDate.forEach(function(data){
				let newRow = table.insertRow();
				let newCell = newRow.insertCell();
				let newText = document.createTextNode(data.date);
				newCell.appendChild(newText);
				let newTitle = document.createTextNode(data.title);
				let title = newRow.insertCell();
				title.appendChild(newTitle);
			});
		}
	}
}
