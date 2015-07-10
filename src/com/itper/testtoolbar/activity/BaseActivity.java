package com.itper.testtoolbar.activity;

import com.itper.testtoolbar.R;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

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
			toolbar.setSubtitle(getToolbarSubtitle());
		}
	}
	
	public Toolbar getToolbar(){
		return toolbar;
	}

    public Resources getRes(){
        return BaseActivity.this.getResources();
    }

    public void showSToast(String msg){
        Toast.makeText(BaseActivity.this, msg, Toast.LENGTH_SHORT).show();
    }

    public void showLToast(int msg){
        Toast.makeText(BaseActivity.this, msg, Toast.LENGTH_SHORT).show();
    }
	
	protected abstract int getContentView();
	protected abstract boolean hasToolbar();
	protected abstract int getNavigationIcon();
	protected abstract String getToolbarTitle();
	protected abstract String getToolbarSubtitle();
}
