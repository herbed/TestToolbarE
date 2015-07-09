package com.itper.testtoolbar.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtil {


	public static String getStringToDate(long time) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		return df.format(new Date(time));
	}
	
	public static String getStringToDate(String time) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		return df.format(new Date(time));
	}
}
