package com.itper.testtoolbar.util;

import android.util.Log;

public class LogUtil {
	
	public static final boolean DEBUG = true;
	public static final String TAG = "itper";

	//Log type: information (green)
	public static void i(String msg){
		if(DEBUG) Log.i(TAG, buildMessage(msg));
	}
	
	public static void i(int msg){
		if(DEBUG) Log.i(TAG, buildMessage(msg+""));
	}

	public static void i(String tag, String msg){
		if(DEBUG) Log.i(tag, buildMessage(msg));
	}
	
	public static void i(String tag, int msg){
		if(DEBUG) Log.i(tag, buildMessage(msg+""));
	}

	
	//Log type: verbose (black)
	public static void v(String msg){
		if(DEBUG) Log.v(TAG, buildMessage(msg));
	}
	
	public static void v(int msg){
		if(DEBUG) Log.v(TAG, buildMessage(msg+""));
	}

	public static void v(String tag, String msg){
		if(DEBUG) Log.v(tag, buildMessage(msg));
	}
	
	public static void v(String tag, int msg){
		if(DEBUG) Log.v(tag, buildMessage(msg+""));
	}

	
	//Log type: debug (blue)
	public static void d(String msg){
		if(DEBUG) Log.d(TAG, buildMessage(msg));
	}
	
	public static void d(int msg){
		if(DEBUG) Log.d(TAG, buildMessage(msg+""));
	}

	public static void d(String tag, String msg){
		if(DEBUG) Log.d(tag, buildMessage(msg));
	}
	
	public static void d(String tag, int msg){
		if(DEBUG) Log.d(tag, buildMessage(msg+""));
	}


	//Log type: warning (orange)
	public static void w(String msg){
		if(DEBUG) Log.w(TAG, buildMessage(msg));
	}
	
	public static void w(int msg){
		if(DEBUG) Log.w(TAG, msg+"");
	}

	public static void w(String tag, String msg){
		if(DEBUG) Log.w(tag, buildMessage(msg));
	}
	
	public static void w(String tag, int msg){
		if(DEBUG) Log.w(tag, buildMessage(msg+""));
	}

	
	//Log type: error (red)
	public static void e(String msg){
		if(DEBUG) Log.e(TAG, buildMessage(msg));
	}
	
	public static void e(int msg){
		if(DEBUG) Log.e(TAG, buildMessage(msg+""));
	}

	public static void e(String tag, String msg){
		if(DEBUG) Log.e(tag, buildMessage(msg));
	}
	
	public static void e(String tag, int msg){
		if(DEBUG) Log.e(tag, buildMessage(msg+""));
	}
	

    //类，方法信息
	protected static String buildMessage(String msg) {
		StackTraceElement caller = new Throwable().fillInStackTrace().getStackTrace()[2];
		return new StringBuilder().append(caller.getClassName()).append(".").append(caller.getMethodName()).append("(): ").append(msg).toString();
	}

}
