package com.example.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

//员工调动
public class Transfer {
    //旧部门
    private String oPost;
    //新部门
    private String nPost;
    //旧职位
    private String oDepartment;
    //新职位
    private String nDepartment;
    //日期
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime changeDate;
    //原因
    private String cause;
}
