package com.example.param;

public class TrainningQueryParam {
    private int pageNum = 1;
    private int pageSize = 10;

    public int getPageSize() {
        return pageSize;
    }
    public int getPageNum() {
        return pageNum;
    }
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }
}
