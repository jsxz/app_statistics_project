package com.atguigu.hive;

import org.apache.hadoop.hive.ql.exec.UDF;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by atguigu on 2017/11/9
 */
public class MonthBeginUDF extends UDF {

    // 计算本月的起始时刻(毫秒数)
    public long evaluate() throws ParseException {
        return DateUtil.getMonthBeginTime(new Date()).getTime() ;
    }

    // 指定月偏移量
    public long evaluate(int offset) throws ParseException {
        return DateUtil.getMonthBeginTime(new Date(),offset).getTime();
    }

    // 计算某月的起始时刻，日期类型(毫秒数)
    public long evaluate(Date d) throws ParseException {
        return DateUtil.getMonthBeginTime(d).getTime();
    }

    // 计算某月的起始时刻，日期类型，带偏移量(毫秒数)
    public long evaluate(Date d,int offset) throws ParseException {
        return DateUtil.getMonthBeginTime(d,offset).getTime();
    }

    // 计算某月的起始时刻，String类型(毫秒数)
    public long evaluate(String dateStr) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date d = sdf.parse(dateStr);

        return DateUtil.getMonthBeginTime(d).getTime();
    }

    // 计算某月的起始时刻，String类型，带偏移量(毫秒数)
    public long evaluate(String dateStr,int offset) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date d = sdf.parse(dateStr);

        return DateUtil.getMonthBeginTime(d, offset).getTime();
    }

    // 计算某月的起始时刻，String类型，带格式化要求(毫秒数)
    public long evaluate(String dateStr, String fmt) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        Date d = sdf.parse(dateStr);

        return DateUtil.getMonthBeginTime(d).getTime();
    }

    // 计算某月的起始时刻，String类型，带格式化，带偏移量(毫秒数)
    public long evaluate(String dateStr, String fmt,int offset) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        Date d = sdf.parse(dateStr);

        return DateUtil.getMonthBeginTime(d, offset).getTime();
    }
}
