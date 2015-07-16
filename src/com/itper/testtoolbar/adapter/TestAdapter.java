package com.itper.testtoolbar.adapter;

import com.itper.testtoolbar.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class TestAdapter extends BaseAdapter{
	private LayoutInflater inflater;
	
	public TestAdapter(Context context) {
		// TODO Auto-generated constructor stub
		inflater = LayoutInflater.from(context);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 50;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		convertView = inflater.inflate(R.layout.item_test, null);
		
		return convertView;
	}

}
