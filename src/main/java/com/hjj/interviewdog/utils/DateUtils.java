package com.hjj.interviewdog.utils;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateUtils {

    /**
     * 获取今日日期和今天距离第一天的天数
     *
     * @return
     */
    public static long getGapDayFromFirstDayOfYear() {
        LocalDate today = LocalDate.now();
        LocalDate firstDayOfYear = LocalDate.of(today.getYear(), 1, 1);
        long days = ChronoUnit.DAYS.between(firstDayOfYear, today);
        return days;
    }

    public static int getNowYear() {
        return LocalDate.now().getYear();
    }

}