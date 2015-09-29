package com.luckyrui.platform.questionnaire.dao;

import java.util.List;
import java.util.Map;

import com.luckyrui.platform.questionnaire.model.QueQuestion;

public interface QueQuestionDao {
    int deleteByPrimaryKey(String id);

    int insert(QueQuestion record);

    int insertSelective(QueQuestion record);

    QueQuestion selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(QueQuestion record);

    int updateByPrimaryKey(QueQuestion record);
    
    List<Map<String, Object>> selectAllShowPage();
}