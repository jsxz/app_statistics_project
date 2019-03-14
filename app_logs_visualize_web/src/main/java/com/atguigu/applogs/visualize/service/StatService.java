package com.atguigu.applogs.visualize.service;

import com.atguigu.applogs.visualize.domain.StatBean;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by atguigu on 2017/11/9
 */

public interface StatService {
    public StatBean findNewUsers();

    List<StatBean> findThisWeekNewUsers(String sdk34734);
}
