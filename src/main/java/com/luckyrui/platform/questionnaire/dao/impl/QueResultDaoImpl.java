package com.luckyrui.platform.questionnaire.dao.impl;

import org.springframework.stereotype.Repository;

import com.luckyrui.platform.dao.SessionDao;
import com.luckyrui.platform.questionnaire.dao.QueResultDao;
import com.luckyrui.platform.questionnaire.model.QueResult;

@Repository
public class QueResultDaoImpl extends SessionDao implements QueResultDao{

	@Override
	public int deleteByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(QueResult record) {
		return this.getSession().insert(this.getStatement("insert"),record);
	}

	@Override
	public int insertSelective(QueResult record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public QueResult selectByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(QueResult record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(QueResult record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
