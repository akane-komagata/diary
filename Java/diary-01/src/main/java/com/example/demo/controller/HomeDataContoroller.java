package com.example.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.DiaryInfo;
import com.example.demo.service.DiaryService;

@RestController
@RequestMapping("/api/inquiry")
public class HomeDataContoroller {
    final static Logger logger = LoggerFactory.getLogger(HomeContoroller.class);

    @Autowired
    private DiaryService diaryService;

    /**
     * 日記データを画面に表示させる
     * @return 日記データ
     */
    @GetMapping
    @ResponseBody
    public List<DiaryInfo> DiaryList() {
        return diaryService.getDiaryList();
    }
}
