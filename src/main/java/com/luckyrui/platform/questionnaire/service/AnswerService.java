package com.luckyrui.platform.questionnaire.service;


/**
 * 问题业务类
 * @author chenrui
 *
 */
public interface AnswerService {
	/**
	 * 提交答案
	 * @param p "questionId_answerId"
	 * @return
	 */
	public boolean submitAnswer(String[] p);
}
