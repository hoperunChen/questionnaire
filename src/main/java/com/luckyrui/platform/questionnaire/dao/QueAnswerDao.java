package com.luckyrui.platform.questionnaire.dao;

import com.luckyrui.platform.questionnaire.model.QueAnswer;

public interface QueAnswerDao {
    int deleteByPrimaryKey(String id);

    int insert(QueAnswer record);

    int insertSelective(QueAnswer record);

    QueAnswer selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(QueAnswer record);

    int updateByPrimaryKey(QueAnswer record);
}