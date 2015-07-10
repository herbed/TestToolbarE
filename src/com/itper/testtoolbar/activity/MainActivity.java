package com.itper.testtoolbar.activity;

import com.itper.testtoolbar.R;
import com.itper.testtoolbar.adapter.TestAdapter;
import com.itper.testtoolbar.util.LogUtil;
import com.itper.testtoolbar.util.TimeUtil;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.LinearLayout;
import android.widget.ListView;

public class MainActivity extends BaseActivity {
	private ListView listView;
    private float mStartY = 0, mLastY = 0, mLastDeltaY;  

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		new CountDownTimer(3000, 3000) {
			
			@Override
			public void onTick(long millisUntilFinished) {}
			
			@Override
			public void onFinish() {
				getToolbar().setSubtitle(TimeUtil.getStringToDate(System.currentTimeMillis()));
			}
		}.start();
		
		listView = (ListView) findViewById(R.id.lv_test);
		
		View headerView = getLayoutInflater().inflate(R.layout.header_lv, null);
		listView.addHeaderView(headerView);
		
		listView.setAdapter(new TestAdapter(this));
		
		listView.setOnTouchListener(new OnTouchListener() {
			
			@SuppressLint("NewApi")
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				final float y = event.getY();
				float translateY = getToolbar().getTranslationY();
				switch (event.getAction()) {
				case MotionEvent.ACTION_DOWN:
					mStartY = y;
					mLastY = mStartY;
					break;
				case MotionEvent.ACTION_MOVE:
					float mDeltaY = y - mLastY;
					float newTansY = translateY + mDeltaY;
					if(newTansY <= 0 && newTansY >= -getToolbar().getHeight()){
						getToolbar().setTranslationY(newTansY);
					}
					mLastY = y;
					mLastDeltaY = mDeltaY;
					break;
				case MotionEvent.ACTION_UP:
                    ObjectAnimator animator = null;  
                    LogUtil.d("mLastDeltaY=" + mLastDeltaY);  
                    if (mLastDeltaY < 0 && listView.getFirstVisiblePosition() > 1) {  
                        LogUtil.v("listView.first=" + listView.getFirstVisiblePosition());  
                        animator = ObjectAnimator.ofFloat(getToolbar(), "translationY", getToolbar().getTranslationY(), -getToolbar().getHeight());  
                    } else {  
                        animator = ObjectAnimator.ofFloat(getToolbar(), "translationY", getToolbar().getTranslationY(), 0);  
                    }  
                    animator.setDuration(100);  
                    animator.start();  
//                    animator.setInterpolator(AnimationUtils.loadInterpolator(MainActivity.this, android.R.interpolator.linear));  
//                    Log.v(TAG, "Up");  
                    break;  

				default:
					break;
				}
				return false;
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	protected int getContentView() {
		// TODO Auto-generated method stub
		return R.layout.activity_main;
	}

	@Override
	protected boolean hasToolbar() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	protected int getNavigationIcon() {
		// TODO Auto-generated method stub
		return R.drawable.ic_launcher;
	}

	@Override
	protected String getToolbarTitle() {
		// TODO Auto-generated method stub
		return "LiuPeng";
	}

	@Override
	protected String getToolbarSubtitle() {
		// TODO Auto-generated method stub
		return null;
	}
}
