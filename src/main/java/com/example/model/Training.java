package com.example.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;
import java.util.List;

//培训
public class Training {
    //培训ID
    private String id;
    //培训名称
    private String name;
    //培训日期
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime trainDate;
    //培训地点
    private String place;
    //培训内容
    private List<String> skills;
    //是否完成培训
    private boolean already;

}
