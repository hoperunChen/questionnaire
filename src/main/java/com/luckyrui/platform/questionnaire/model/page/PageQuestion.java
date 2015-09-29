package com.luckyrui.platform.questionnaire.model.page;

import java.util.ArrayList;
import java.util.List;

import com.luckyrui.platform.questionnaire.model.QueAnswer;
import com.luckyrui.platform.questionnaire.model.QueQuestion;

public class PageQuestion {
	/**
	 * 中间表id
	 */
	private String id;
	
	/**
	 * 问题
	 */
	private QueQuestion queQuestion;
	
	/**
	 * 答案
	 */
	private List<QueAnswer> queAnswers;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public QueQuestion getQueQuestion() {
		return queQuestion;
	}

	public void setQueQuestion(QueQuestion queQuestion) {
		this.queQuestion = queQuestion;
	}

	public List<QueAnswer> getQueAnswers() {
		return queAnswers;
	}

	public void setQueAnswers(List<QueAnswer> queAnswers) {
		this.queAnswers = queAnswers;
	}
	
	public String getQueId(){
		return queQuestion == null ? null : queQuestion.getId();
	}

	public void addQueAnswers(QueAnswer answer) {
		if(answer==null)
			return;
		if(getQueAnswers()==null)
			setQueAnswers(new ArrayList<QueAnswer>());
		getQueAnswers().add(answer);
	}

	
	
}
