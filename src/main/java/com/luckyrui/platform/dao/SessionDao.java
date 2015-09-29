package com.luckyrui.platform.dao;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;

public abstract class SessionDao extends BaseDao {
	
	@Resource
	private SqlSessionTemplate sqlSessionTemplate;
	
	protected SqlSession getSession(){
		return sqlSessionTemplate;
	}

}
