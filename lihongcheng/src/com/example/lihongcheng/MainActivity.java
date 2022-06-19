package com.example.lihongcheng;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	//1.定义按钮对象
	Button btn_info,btn_role,btn_actor,btn_review;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn_info = (Button)findViewById(R.id.btn_info);
		btn_role = (Button)findViewById(R.id.btn_role);
		btn_actor = (Button)findViewById(R.id.btn_actor);
		btn_review = (Button)findViewById(R.id.btn_review);
		
		btn_info.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(MainActivity.this,InfoActivity.class);
				
				startActivity(intent);				
			}
		});
		btn_role.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub

				
				Intent intent=new Intent(MainActivity.this,RoleActivity.class);
				startActivity(intent);
				
			}
		});
		btn_actor.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub

				
				Intent intent=new Intent(MainActivity.this,ActorActivity.class);
				startActivity(intent);
				
			}
		});
		btn_review.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub

				
				Intent intent=new Intent(MainActivity.this,ReviewActivity.class);
				startActivity(intent);
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
