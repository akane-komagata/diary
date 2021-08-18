package com.example.demo.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.dto.DiaryInfo;
import com.example.demo.rowMapper.DiaryInfoRowMapper;

@Service
public class DiaryService {
    final static Logger logger = LoggerFactory.getLogger(DiaryService.class);
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<DiaryInfo> getDiaryList() {
        List<DiaryInfo> gettingDiaryList = jdbcTemplate.query(
                "SELECT * FROM diary ORDER BY date ASC",
                new DiaryInfoRowMapper());
        //        logger.info(gettingDiaryList);
        return gettingDiaryList;
    }
}
