package com.luckyrui.platform.questionnaire.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.luckyrui.platform.dao.SessionDao;
import com.luckyrui.platform.questionnaire.dao.QueQuestionDao;
import com.luckyrui.platform.questionnaire.model.QueQuestion;


@Repository
public class QueQuestionDaoImpl extends SessionDao implements QueQuestionDao {

	@Override
	public int deleteByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(QueQuestion record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(QueQuestion record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public QueQuestion selectByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(QueQuestion record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(QueQuestion record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Map<String, Object>> selectAllShowPage() {
		return this.getSession().selectList(this.getStatement("selectAllShowPage"));
	}

}
