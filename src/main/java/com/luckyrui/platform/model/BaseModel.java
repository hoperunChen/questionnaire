package com.luckyrui.platform.model;

import java.io.Serializable;
import java.util.Date;

import com.luckyrui.platform.constants.Constants;

public abstract class BaseModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6969975205234994973L;

	/**
	 * 创建时间
	 */
	protected Date createTime;
	/**
	 * 创建用户
	 */
	protected String createUser;
	/**
	 * 修改用户
	 */
	protected String updateUser;
	/**
	 * 修改时间
	 */
	protected Date updateTime;
	/**
	 * 是否删除
	 */
	protected String deleteFlag = Constants.DeleteStatus.VALID;

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

}
