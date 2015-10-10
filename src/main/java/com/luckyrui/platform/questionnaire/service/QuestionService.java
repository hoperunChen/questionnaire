package com.luckyrui.platform.questionnaire.service;

import java.util.List;
import java.util.Map;

import com.luckyrui.platform.questionnaire.model.page.PageQuestion;

/**
 * 问题服务类
 * @author chenrui
 *
 */
public interface QuestionService {
	/**
	 * 查询所有问题列表
	 * @return 问题列表,PageQuestion:用于页面展示的问题实体
	 */
	public List<PageQuestion> getAllQuestionsWithPage();
	
	/**
	 * 添加问题
	 * @return
	 */
	public Map<String, Object> addQuestion(String question,String[] answer,String sort,String visible);
	
	/**
	 * 删除问题
	 * @param qqaId
	 */
	public void deleteQuestion(String qqaId);
}
