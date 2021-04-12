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
    private LocalDateTime gmtDimission;
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


    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public LocalDateTime getGmtCreated() {
        return gmtCreated;
    }
    public LocalDateTime getGmtDimission() {
        return gmtDimission;
    }
    public String getTelephone() {
        return telephone;
    }
    public String getEmail() {
        return email;
    }
    public String getIp() {
        return ip;
    }
    public Post getPost() {
        return post;
    }
    public String getDepartment() {
        return department;
    }
    public int getLimits() {
        return limits;
    }
    public List<Training> getTrainings() {
        return trainings;
    }
    public List<Transfer> getTransfers() {
        return transfers;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setGmtCreated(LocalDateTime gmtCreated) {
        this.gmtCreated = gmtCreated;
    }
    public void setGmtDimission(LocalDateTime gmtDimission) {
        this.gmtDimission = gmtDimission;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }
    public void setPost(Post post) {
        this.post = post;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setLimits(int limits) {
        this.limits = limits;
    }
    public void setTrainings(List<Training> trainings) {
        this.trainings = trainings;
    }
    public void setTransfers(List<Transfer> transfers) {
        this.transfers = transfers;
    }
}
