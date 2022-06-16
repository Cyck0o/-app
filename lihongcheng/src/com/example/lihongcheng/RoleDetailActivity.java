package com.example.lihongcheng;

import com.example.lihongcheng.pojo.Role;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

public class RoleDetailActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_role_detail);
		
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayShowHomeEnabled(false);
		//���ñ���
		Intent intent=getIntent();
		
		//�����intent���󱻽���
		if (intent != null){
			//��ȡ���ݹ���������
			Bundle bundle = intent.getExtras();
			String roleName = bundle.getString("roleName");
			String roleInfo = bundle.getString("roleInfo");
			int roleImage = bundle.getInt("roleImage");
			
			//��ʼ���ؼ�
			ImageView image_role_detail =(ImageView)findViewById(R.id.image_role_detail);
			TextView txt_role_detail = (TextView) findViewById(R.id.txt_role_detail);
			
			//��
			image_role_detail.setImageResource(roleImage);
			txt_role_detail.setText(roleInfo);
			actionBar.setTitle(roleName);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.role_detail, menu);
		return true;
	}

}
