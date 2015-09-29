package com.luckyrui.platform.questionnaire.service.impl;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.luckyrui.platform.questionnaire.dao.QueResultDao;
import com.luckyrui.platform.questionnaire.model.QueResult;
import com.luckyrui.platform.questionnaire.service.AnswerService;
import com.luckyrui.platform.utils.BaseUtils;

@Service
public class AnswerServiceImpl implements AnswerService{
	
	@Resource
	QueResultDao resultDao;

	@Override
	public boolean submitAnswer(String[] p) {
		for (String qa : p) {
			String [] qaArray = qa.split("_");
			String queId = qaArray[0];
			String ansId = qaArray[1];
			QueResult result = new QueResult();
			result.setId(BaseUtils.getUUID());
			result.setAnswer(ansId);
			result.setQuestionId(queId);
			result.setCreateTime(new Date());
			result.setCreateUser("a");
			//TODO save
			resultDao.insert(result);
		}
		return true;
	}

}
