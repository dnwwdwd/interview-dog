package com.hjj.interviewdog.constant;

import java.util.Date;

public interface RedisConstant {
    public static String USER_SIGN_IN_REDIS_PREFIX = "interviewdog:user:signin";

    static String getUserSignInRedisKey(int year, long userId) {
        return String.format("%s:%s:%s", USER_SIGN_IN_REDIS_PREFIX, userId, year);
    }
}
