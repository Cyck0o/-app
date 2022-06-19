
package com.example.lihongcheng;

import java.util.ArrayList;
import java.util.List;

import com.example.lihongcheng.adapter.RoleAdapter;
import com.example.lihongcheng.pojo.Role;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.content.res.TypedArray;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class RoleActivity extends Activity {
 
 
 List<Role> list = new ArrayList<Role>();
 @Override
 protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_role);
  
  
  ActionBar actionBar=getActionBar();
  actionBar.setDisplayShowHomeEnabled(false);
  //1.设置数据
  
  initData(); 
  //2.设置适配器
  RoleAdapter adapter = new RoleAdapter(this, R.layout.item_role, list);
  
  
  //3.加载适配器
  ListView lv_role = (ListView) findViewById(R.id.lv_role);
  
  lv_role.setAdapter(adapter);
  
  //4.设置列表项功能
  lv_role.setOnItemClickListener(new OnItemClickListener(){
	  
	  @Override
	  public void onItemClick(AdapterView<?>arg0, View arg1, int arg2,
			  long id){
		  Intent intent=new Intent(RoleActivity.this,RoleDetailActivity.class);
		  
		  //intent.putExtra("role",list.get(position));
		  Bundle bundle=new Bundle();
		  bundle.putString("roleName",list.get(arg2).getRoleName());
		  bundle.putString("roleInfo",list.get(arg2).getRoleInfo());
		  bundle.putInt("roleImage",list.get(arg2).getRoleImage());
		  intent.putExtras(bundle);
		  
		  startActivity(intent);
	  }

	
	  
	  
  });
  
  
  
 }
 //初始化数据

public void initData(){
  //获取数据
  
  TypedArray typedArray = getResources().obtainTypedArray(R.array.array_role_image);
  
  String roleName[] = getResources().getStringArray(R.array.array_role_name);
  
  String roleActor[] = getResources().getStringArray(R.array.array_role_actor);
  
  String roleInfo[] = getResources().getStringArray(R.array.array_role_info);
  
  for(int i=0;i<roleName.length;i++){
   Role role = new Role(typedArray.getResourceId(i, 0), roleName[i], roleActor[i], roleInfo[i]);
   
   list.add(role);
  }
 }

 @Override
 public boolean onCreateOptionsMenu(Menu menu) {
  // Inflate the menu; this adds items to the action bar if it is present.
  getMenuInflater().inflate(R.menu.role, menu);
  return true;
 }

}