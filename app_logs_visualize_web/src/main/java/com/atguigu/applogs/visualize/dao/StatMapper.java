package com.atguigu.applogs.visualize.dao;

import com.atguigu.applogs.visualize.domain.StatBean;

import java.util.List;

/**
 * Created by atguigu on 2017/11/9
 */
public interface StatMapper<T> {
    public StatBean findNewUsers();

    List<StatBean> findThisWeekNewUsers(String sdk34734);

}
