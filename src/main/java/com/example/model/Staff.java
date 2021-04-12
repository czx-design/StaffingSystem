package com.example.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;
import java.util.List;

//员工
public class Staff {
    //员工ID
    private String id;
    //员工姓名
    private String name;
    //入职时间
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime gmtCreated;
    //离职时间
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime gmtModified;
    //手机号码
    private String telephone;
    //email
    private String email;
    //员工IP
    private String ip;
    //员工部门
    private Post post ;
    //员工职务
    private String department;
    //员工权限(1-9级)
    private int limits;
    //员工培训
    private List<Training> trainings;
    //员工调动
    private List<Transfer> transfers;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
