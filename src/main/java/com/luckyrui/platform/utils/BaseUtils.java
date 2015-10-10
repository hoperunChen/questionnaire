package com.luckyrui.platform.utils;

import java.util.Collection;
import java.util.Map;
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

	public static boolean isEmpty(Collection<?> co) {
		if (co != null && !co.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean isEmpty(Map<?, ?> map) {
		if (map != null && map.size() > 0) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean isEmpty(String str) {
		return str == null || str.trim().length() == 0;
	}

	public static boolean isEmpty(String[] str) {
		boolean flag = false;
		for (String s : str) {
			if (s == null || s.isEmpty()) {
				flag = true;
				break;
			}
		}
		return flag;
	}

}
