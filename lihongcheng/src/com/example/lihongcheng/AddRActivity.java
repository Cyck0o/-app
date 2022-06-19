package com.example.lihongcheng;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.example.lihongcheng.dao.ReviewDao;
import com.example.lihongcheng.pojo.Review;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddRActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add);
		
		ActionBar actionBar=getActionBar();
		actionBar.setDisplayShowHomeEnabled(false);
		
		setEvent();
	}

	public void setEvent() {
		// TODO Auto-generated method stub
		Button btn_enter=(Button)findViewById(R.id.btn_enter);
		Button btn_cancel=(Button)findViewById(R.id.btn_cancel);
		final EditText etxt_review_author=(EditText) findViewById(R.id.etxt_review_author);
		final EditText etxt_review_content=(EditText) findViewById(R.id.etxt_review_content);
		
		btn_enter.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String author=etxt_review_author.getText().toString();
				String content=etxt_review_content.getText().toString();
				Date nowDate=new Date();
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
				String date=sdf.format(nowDate);
				if(author.equals("")|| content.equals("")){
					Toast.makeText(AddRActivity.this, "请输入发布者和影评内容!",Toast.LENGTH_LONG).show();
					
				}else{
					Review review=new Review();
					review.setAuthor(author);
					review.setContent(content);
					review.setDate(date);
					
					ReviewDao dao =new ReviewDao(AddRActivity.this);
					int result=dao.add(review);
					if(result==1){
						Toast.makeText(AddRActivity.this, "影评分布成功",Toast.LENGTH_LONG).show();
						finish();
					}else{
						Toast.makeText(AddRActivity.this, "影评分布失败",Toast.LENGTH_LONG).show();
					}
				}
			}
			
		});
		btn_cancel.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				etxt_review_author.setText("");
				etxt_review_content.setText("");
			}
			
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.add_r, menu);
		return true;
	}

}
