package com.luckyrui.platform.dao;

public class BaseDao {
	private String namespace = "";

	public BaseDao() {
		this.namespace = this.getClass().getInterfaces()[0].getName();
	}

	protected String getStatement(String mapperId) {
		return this.namespace + "." + mapperId;
	}
}
