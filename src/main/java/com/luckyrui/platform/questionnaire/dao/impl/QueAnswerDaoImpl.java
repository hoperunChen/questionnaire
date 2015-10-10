package com.luckyrui.platform.questionnaire.dao.impl;

import org.springframework.stereotype.Repository;

import com.luckyrui.platform.dao.SessionDao;
import com.luckyrui.platform.questionnaire.dao.QueAnswerDao;
import com.luckyrui.platform.questionnaire.model.QueAnswer;

@Repository
public class QueAnswerDaoImpl extends SessionDao implements QueAnswerDao{

	@Override
	public int deleteByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(QueAnswer record) {
		return this.getSession().insert(this.getStatement("insert"),record);
	}

	@Override
	public int insertSelective(QueAnswer record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public QueAnswer selectByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(QueAnswer record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(QueAnswer record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
