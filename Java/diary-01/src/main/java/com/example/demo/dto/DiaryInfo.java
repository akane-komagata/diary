package com.example.demo.dto;

import org.springframework.context.annotation.Configuration;

@Configuration
public class DiaryInfo {
    private int diaryId;
    private String date;
    private String title;
    private String diary;

    public int getDiaryId() {
        return diaryId;
    }

    public void setDiaryId(int diaryId) {
        this.diaryId = diaryId;
    }

    public String getDate() {
        return date;
    }

    public void setDiaryDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setDiaryTitle(String title) {
        this.title = title;
    }

    public String getDiary() {
        return diary;
    }

    public void setDiaryDiary(String diary) {
        this.diary = diary;
    }
}