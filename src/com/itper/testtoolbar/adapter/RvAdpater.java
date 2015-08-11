package com.itper.testtoolbar.adapter;

import com.itper.testtoolbar.R;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class RvAdpater extends Adapter<RvAdpater.ViewHolder>{
	
	private Context context;
	
	public RvAdpater(Context context) {
		this.context = context;
	}

	@Override
	public int getItemCount() {
		// TODO Auto-generated method stub
		return 50;
	}

	@Override
	public void onBindViewHolder(ViewHolder arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int position) {
		// TODO Auto-generated method stub
		View view = LayoutInflater.from(context).inflate(R.layout.item_test, viewGroup, false);;
		return new ViewHolder(view);
	}
	
    // 重写的自定义ViewHolder
    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View v ) {
            super(v);
        }
    }
}
