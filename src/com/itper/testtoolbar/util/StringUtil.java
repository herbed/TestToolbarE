package com.itper.testtoolbar.util;

public class StringUtil {
	
	/**
	 * �ַ����Ƿ�Ϊ��,Ϊ�շ���true,���򷵻�false
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
