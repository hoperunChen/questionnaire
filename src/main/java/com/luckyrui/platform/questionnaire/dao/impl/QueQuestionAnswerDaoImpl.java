package com.luckyrui.platform.questionnaire.dao.impl;

import org.springframework.stereotype.Repository;

import com.luckyrui.platform.dao.SessionDao;
import com.luckyrui.platform.questionnaire.dao.QueQuestionAnswerDao;
import com.luckyrui.platform.questionnaire.model.QueQuestionAnswer;

@Repository
public class QueQuestionAnswerDaoImpl extends SessionDao implements QueQuestionAnswerDao{

	@Override
	public int deleteByPrimaryKey(String id) {
		return this.getSession().delete(this.getStatement("deleteByPrimaryKey"),id);
	}

	@Override
	public int insert(QueQuestionAnswer record) {
		return this.getSession().insert(this.getStatement("insert"),record);
	}

	@Override
	public int insertSelective(QueQuestionAnswer record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public QueQuestionAnswer selectByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(QueQuestionAnswer record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(QueQuestionAnswer record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
