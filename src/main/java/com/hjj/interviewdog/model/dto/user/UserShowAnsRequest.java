package com.hjj.interviewdog.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户是否展示答案请求体
 */
@Data
public class UserShowAnsRequest implements Serializable {
    private Integer isShowedAns;

}
