package com.example.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

//员工调动
public class Transfer {
    //调动处理id
    private String id;
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

    public String getId() {
        return id;
    }
    public String getoPost() {
        return oPost;
    }
    public String getnPost() {
        return nPost;
    }
    public String getoDepartment() {
        return oDepartment;
    }
    public String getnDepartment() {
        return nDepartment;
    }
    public LocalDateTime getChangeDate() {
        return changeDate;
    }
    public String getCause() {
        return cause;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setoPost(String oPost) {
        this.oPost = oPost;
    }
    public void setnPost(String nPost) {
        this.nPost = nPost;
    }
    public void setoDepartment(String oDepartment) {
        this.oDepartment = oDepartment;
    }
    public void setnDepartment(String nDepartment) {
        this.nDepartment = nDepartment;
    }
    public void setChangeDate(LocalDateTime changeDate) {
        this.changeDate = changeDate;
    }
    public void setCause(String cause) {
        this.cause = cause;
    }
}
