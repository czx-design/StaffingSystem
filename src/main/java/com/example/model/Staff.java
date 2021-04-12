package com.example.model;

import java.time.LocalDateTime;

public class Staff {
    private String name;
    private String id;
    //入职时间
    private LocalDateTime gmtCreated;
    //离职时间
    private LocalDateTime gmtModified;
    //手机号码
    private String telephone;
    //email
    private String email;
    //员工IP
    private String ip;
    //员工部门
    private String post;
    //员工职务
    private String department;
    //员工权限(1-9级)
    private int limits;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
