package com.luckyrui.platform.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * 用于json返回时的对像封装。
 * @author chenrui
 * 
 */
public class ApiUtils {
	private static final String RESPONSE = "response";

	/**
	 * 返回成功类型的json
	 * @return
	 */
	public static Map<String, Object> getSuccess(){
		Map<String, Object> rtn = new HashMap<String, Object>();
		rtn.put("code", 0);
        rtn.put("msg", "");
        rtn.put(RESPONSE, new HashMap<String, String>());
        return rtn;
		
	}
	
	/**
	 * 返回成功类型的json
	 * @param obj 返回的对象
	 * @return
	 */
	public static Map<String, Object> getSuccess(Object obj){
		Map<String, Object> rtn = new HashMap<String, Object>();
		rtn.put("code", 0);
        rtn.put("msg", "");
        rtn.put(RESPONSE, obj);
        return rtn;
	}
	
	/**
	 * 返回错误信息
	 * @param msg
	 * @return
	 */
	public static Map<String, Object> getError(String msg){
		Map<String, Object> rtn = new HashMap<String, Object>();
		rtn.put("code", 1);
        rtn.put("msg", msg);
        rtn.put(RESPONSE, new HashMap<String,String>());
        return rtn;
	}
}
