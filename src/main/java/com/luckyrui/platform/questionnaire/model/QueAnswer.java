package com.luckyrui.platform.questionnaire.model;


import com.luckyrui.platform.model.BaseModel;

public class QueAnswer extends BaseModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 284584146015141397L;

	private String id;

	private String answer;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

}