package com.example.lihongcheng;



import java.util.ArrayList;
import java.util.List;

import com.example.lihongcheng.R;
import com.example.lihongcheng.adapter.RevivewAdapter;
import com.example.lihongcheng.dao.ReviewDao;
import com.example.lihongcheng.pojo.Review;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class ReviewActivity extends Activity {
	List<Review> list = new  ArrayList<Review>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_review);
		
		//���ر�������ͼ��
		ActionBar actionBar=getActionBar();
		actionBar.setDisplayShowHomeEnabled(false);
		
		//���������б���
		setListView();
		//�������ð�ť����
		setEvent();
		
		
		
	}	

public void setListView(){		
		//��������
		ReviewDao dao = new ReviewDao(ReviewActivity.this);
		list=dao.select();
		//����������
		RevivewAdapter adapter = new RevivewAdapter(this,R.layout.item_review,list);
		
		//����������
		ListView lv_review = (ListView) findViewById(R.id.lv_review);
		lv_review.setAdapter(adapter);
		
		//����Ӱ������
		TextView txt_review_count = (TextView) findViewById(R.id.txt_review_count);
		txt_review_count.setText("��"+list.size()+"������");
		}
		

	private void setEvent() {
	// TODO Auto-generated method stub
		Button btn_add_review=(Button) findViewById(R.id.btn_add_review);
		btn_add_review.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(ReviewActivity.this,AddRActivity.class);
				startActivity(intent);
			}
			
		});
	}
@Override
protected void onStart() {
	// TODO Auto-generated method stub
	super.onStart();
	
	setListView();
}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.review, menu);
		return true;
	}

}