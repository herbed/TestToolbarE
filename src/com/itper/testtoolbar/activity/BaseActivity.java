package com.itper.testtoolbar.activity;

import com.itper.testtoolbar.R;
import com.itper.testtoolbar.R.id;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public abstract class BaseActivity extends AppCompatActivity{
	private Toolbar toolbar;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(getContentView());
		if(hasToolbar()){
			toolbar = (Toolbar) findViewById(R.id.toolbar);
			setSupportActionBar(toolbar);
			toolbar.setNavigationIcon(getNavigationIcon());
			toolbar.setTitle(getToolbarTitle());
			toolbar.setSubtitle(getToolbarSubTitle());
		}
	}
	
	public Toolbar getToolbar(){
		return toolbar;
	}

	public void updateToolbarTitle(String title){
		toolbar.setTitle(title);
	}
	
	public void updateToolbarSubTitle(String subTitle){
		toolbar.setSubtitle(subTitle);
	}
	
	public void updateNavigationIcon(int icon){
		toolbar.setNavigationIcon(icon);
	}
	
	protected abstract int getContentView();
	protected abstract boolean hasToolbar();
	protected abstract int getNavigationIcon();
	protected abstract String getToolbarTitle();
	protected abstract String getToolbarSubTitle();
}
