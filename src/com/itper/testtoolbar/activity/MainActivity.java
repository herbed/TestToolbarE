package com.itper.testtoolbar.activity;

import com.itper.testtoolbar.R;
import com.itper.testtoolbar.adapter.RvAdpater;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class MainActivity extends BaseActivity {
	
	private RecyclerView recyclerView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
		
		recyclerView.setLayoutManager(new LinearLayoutManager(this));
		recyclerView.setHasFixedSize(true);
		recyclerView.setAdapter(new RvAdpater(this));
		
		recyclerView.setOnScrollListener(new OnScrollListener() {
			@Override
			public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
				// TODO Auto-generated method stub
				super.onScrolled(recyclerView, dx, dy);
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
