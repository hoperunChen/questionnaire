package com.luckyrui.platform.questionnaire.model;


import com.luckyrui.platform.model.BaseModel;

public class QueQuestion extends BaseModel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 919786610808976545L;

	private String id;

    private String question;

    private String visible;

    private Integer sort;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getVisible() {
		return visible;
	}

	public void setVisible(String visible) {
		this.visible = visible;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

    
}