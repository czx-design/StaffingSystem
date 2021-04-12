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

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public LocalDateTime getTrainDate() {
        return trainDate;
    }
    public String getPlace() {
        return place;
    }
    public List<String> getSkills() {
        return skills;
    }
    public boolean isAlready() {
        return already;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setTrainDate(LocalDateTime trainDate) {
        this.trainDate = trainDate;
    }
    public void setSkills(List<String> skills) {
        this.skills = skills;
    }
    public void setPlace(String place) {
        this.place = place;
    }
    public void setAlready(boolean already) {
        this.already = already;
    }

}
