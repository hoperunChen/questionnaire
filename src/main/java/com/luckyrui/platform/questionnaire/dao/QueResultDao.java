package com.luckyrui.platform.questionnaire.dao;

import com.luckyrui.platform.questionnaire.model.QueResult;

public interface QueResultDao {
    int deleteByPrimaryKey(String id);

    int insert(QueResult record);

    int insertSelective(QueResult record);

    QueResult selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(QueResult record);

    int updateByPrimaryKey(QueResult record);
}