package com.hjj.interviewdog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hjj.interviewdog.model.entity.Question;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

/**
* @author 李鱼皮
* @description 针对表【question(题目)】的数据库操作Mapper
* @createDate 2024-08-24 21:46:47
* @Entity com.hjj.interviewdog.model.entity.Question
*/
public interface QuestionMapper extends BaseMapper<Question> {


    @Select("select * from question where updateTime >= #{minUpdateTime}")
    List<Question> listAllQuestion(Date minUpdateTime);

}




