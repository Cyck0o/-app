package com.example.lihongcheng.adapter;

import java.util.List;

import com.example.lihongcheng.R;
import com.example.lihongcheng.pojo.Review;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class RevivewAdapter extends ArrayAdapter<Review> {

	int resource;
	public RevivewAdapter(Context context, int resource, List<Review> objects) {
		super(context, resource, objects);
		// TODO Auto-generated constructor stub
		this.resource = resource;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		//return super.getView(position, convertView, parent);
		View view=LayoutInflater.from(getContext()).inflate(resource, null);
	
		
		Review review = getItem(position);
		
		
		TextView txt_review_author = (TextView)view.findViewById(R.id.txt_review_author);
		TextView txt_review_date = (TextView)view.findViewById(R.id.txt_review_date);
		TextView txt_review_content = (TextView)view.findViewById(R.id.txt_review_content);
		
		txt_review_author.setText(review.getAuthor());
		txt_review_date.setText(review.getDate());
		txt_review_content.setText(review.getContent());
		
		return view;
		
	}
	
	
}
