package com.example.demo.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.RowMapper;

import com.example.demo.dto.DiaryInfo;

@Configuration
public class DiaryInfoRowMapper implements RowMapper<DiaryInfo> {
    @Override
    public DiaryInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
        DiaryInfo diaryInfo = new DiaryInfo();

        diaryInfo.setDiaryId(rs.getInt("id"));
        diaryInfo.setDiaryDate(rs.getString("date"));
        diaryInfo.setDiaryTitle(rs.getString("title"));
        diaryInfo.setDiaryDiary(rs.getString("diary"));
        return diaryInfo;

    }
}