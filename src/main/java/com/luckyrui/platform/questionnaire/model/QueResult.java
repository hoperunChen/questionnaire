package com.luckyrui.platform.questionnaire.model;


import com.luckyrui.platform.model.BaseModel;

public class QueResult extends BaseModel {
    /**
	 * 
	 */
	private static final long serialVersionUID = -8666588232362261291L;

	private String id;

    private String questionId;

    private String answer;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getQuestionId() {
		return questionId;
	}

	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}


    
}