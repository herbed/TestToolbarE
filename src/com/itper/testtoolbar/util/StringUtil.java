package com.itper.testtoolbar.util;

public class StringUtil {
	
	/**
	 * 字符串是否为空,为空返回true,否则返回false
	 * @param str
	 * @return
	 */
	public static boolean isNull(String str){
		if(str == null || "".equals(str.trim()) || "NULL".equals(str.trim().toUpperCase())){
			return true;
		}else{
			return false;
		}
	}
}
