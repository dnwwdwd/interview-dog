package com.hjj.interviewdog.service.es;

import com.hjj.interviewdog.model.dto.question.QuestionEsDTO;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface QuestionEsDao extends ElasticsearchRepository<QuestionEsDTO, Long> {

}
