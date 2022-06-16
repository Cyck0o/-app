package com.example.lihongcheng;

import java.util.logging.Handler;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class StartActivity extends Activity {
	private TextView txt_jump;
	private boolean isSkip = false;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_start);
		
		txt_jump=(TextView)findViewById(R.id.txt_jump);
		
		//new Handler().postDelayed(new Runnable(){

			//@Override
			//public void run() {
				// TODO Auto-generated method stub
				//Intent intent=new Intent(StartActivity.this,MainActivity.class);
				//startActivity(intent);
				
				//finish();
		//	}
			
	//	},4000);
		txt_jump.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(StartActivity.this,MainActivity.class);
				startActivity(intent);
				
				finish();
			}
		});
	}

	//@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.start, menu);
		return true;
	}

}
