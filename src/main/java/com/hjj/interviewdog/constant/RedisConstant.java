package com.hjj.interviewdog.constant;

public interface RedisConstant {
    public static String USER_SIGN_IN_REDIS_PREFIX = "interviewdog:user:signin";
    public static String BLACK_IP_BlOOM_FILTER_KEY = "interviewdog:blackIpBloomFilterKey";

    static String getUserSignInRedisKey(int year, long userId) {
        return String.format("%s:%s:%s", USER_SIGN_IN_REDIS_PREFIX, userId, year);
    }
}
