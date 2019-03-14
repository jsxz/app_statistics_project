package com.atguigu.applogs.visualize.service;

import com.atguigu.applogs.visualize.dao.StatMapper;
import com.atguigu.applogs.visualize.domain.StatBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by atguigu on 2017/11/9
 */
@Service("statService")
public class StatServiceImpl implements StatService {
    @Autowired
    StatMapper statMapper;

    /**
     * 查询新增用户
     */
    public StatBean findNewUsers() {
        return statMapper.findNewUsers();
    }

    @Override
    public List<StatBean> findThisWeekNewUsers(String sdk34734) {
        return statMapper.findThisWeekNewUsers(sdk34734);
    }

}
