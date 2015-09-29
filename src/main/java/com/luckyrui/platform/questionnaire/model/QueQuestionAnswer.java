package com.luckyrui.platform.questionnaire.model;

import com.luckyrui.platform.model.BaseModel;

public class QueQuestionAnswer extends BaseModel {
    /**
	 * 
	 */
	private static final long serialVersionUID = -1663071003791200138L;

	private String id;

    private String questionId;

    private String answerId;

    private Integer sort;

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

	public String getAnswerId() {
		return answerId;
	}

	public void setAnswerId(String answerId) {
		this.answerId = answerId;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}


    
}