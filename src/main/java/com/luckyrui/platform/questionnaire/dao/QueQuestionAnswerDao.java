package com.luckyrui.platform.questionnaire.dao;

import com.luckyrui.platform.questionnaire.model.QueQuestionAnswer;

public interface QueQuestionAnswerDao {
    int deleteByPrimaryKey(String id);

    int insert(QueQuestionAnswer record);

    int insertSelective(QueQuestionAnswer record);

    QueQuestionAnswer selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(QueQuestionAnswer record);

    int updateByPrimaryKey(QueQuestionAnswer record);
}