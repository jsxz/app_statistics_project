package com.atguigu.applogs.visualize.domain;

/**
 * Created by atguigu on 2017/11/9
 */
public class StatBean {
    //统计日期
    private String date ;
    //统计数量
    private long count ;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }
}
