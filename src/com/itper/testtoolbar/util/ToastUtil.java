package com.itper.testtoolbar.util;

import com.itper.testtoolbar.MyApplication;

import android.widget.Toast;

public class ToastUtil {

	public static void showToast(String msg){
		Toast.makeText(MyApplication.application, msg, Toast.LENGTH_SHORT).show();
	}
	
	public static void showToast(String msg, int time){
		Toast.makeText(MyApplication.application, msg, time).show();
	}
	
	public static void showToast(int msg){
		Toast.makeText(MyApplication.application, msg, Toast.LENGTH_SHORT).show();
	}
	
	public static void showToast(int msg, int time){
		Toast.makeText(MyApplication.application, msg, time).show();
	}
}
