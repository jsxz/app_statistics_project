package com.atguigu.applogs.visualize.controller;

import com.atguigu.applogs.visualize.domain.StatBean;
import com.atguigu.applogs.visualize.service.StatService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by atguigu on 2017/11/9
 */
@Controller
@RequestMapping("/stat")
public class StatController {

    @Resource(name="statService")
    private StatService ss ;

    /**
     * appid = "sdk34734"
     * 本周每天新增用户数
     */
    @RequestMapping("/newusers")
    @ResponseBody
    public StatBean findNewUsers(){
        StatBean bean = ss.findNewUsers();
        return bean ;
    }

    /**
     * 统计
     */
    @RequestMapping("/week1")
    @ResponseBody
    public Map<String, Object> stat3() {

        List<StatBean> list = ss.findThisWeekNewUsers("sdk34734");
        Map<String,Object> map = new HashMap<String,Object>();

        String[] xlabels = new String[list.size()] ;
        long[] newUsers = new long[list.size()];

        for(int i = 0 ; i < list.size() ; i ++){
            xlabels[i] = list.get(i).getDate();
            newUsers[i] = list.get(i).getCount();

            System.out.println(xlabels[i]);
            System.out.println(newUsers[i]);
        }

        map.put("labels",xlabels);
        map.put("data", newUsers);

        return map ;
    }
}
