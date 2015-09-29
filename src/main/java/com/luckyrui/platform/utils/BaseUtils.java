package com.luckyrui.platform.utils;


import java.util.UUID;



/**
 * 一些可能用到的工具方法
 * 
 * @author wangzp
 * 
 */
public class BaseUtils {


	public static String getUUID() {
		String uuid = UUID.randomUUID().toString();
		return uuid.replace("-", "");
	}

}
