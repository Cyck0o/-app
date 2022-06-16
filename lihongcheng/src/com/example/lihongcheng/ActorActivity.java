package com.example.lihongcheng;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.net.Uri;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
//import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter; 

@SuppressLint("NewApi")
public class ActorActivity extends Activity {
 
 
 String[] urlActor ={
   "http://baike.baidu.com/item/姜文",
   "http://baike.baidu.com/item/周润发",
   "http://baike.baidu.com/item/葛优",
   "http://baike.baidu.com/item/刘嘉玲",
   "http://baike.baidu.com/item/陈坤",
   "http://baike.baidu.com/item/周韵",
 };
 

 @Override
 protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_actor);
  //设置标题栏效果
  ActionBar actionBar=getActionBar();
  actionBar.setDisplayShowHomeEnabled(false);
  
  //设置列表效果
  //1、设置数据
  String[] strActor = {"姜文","周润发","葛优","刘嘉玲","陈坤","周韵"};
  int[] imageActor={R.drawable.actor_js,R.drawable.actor_amb,R.drawable.actor_ptlk,R.drawable.actor_yhy,
		  			R.drawable.actor_nk,R.drawable.actor_wl};
  List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();
  for(int i=0;i<strActor.length;i++){
	  Map<String,Object>map=new HashMap<String,Object>();
	  map.put("imageActor", imageActor[i]);
	  map.put("strActor", strActor[i]);
	  list.add(map);
  }
  //2、设置适配器
  //ArrayAdapter<String> adapter =new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, strActor);
  SimpleAdapter adapter=new SimpleAdapter(this, list, R.layout.item_actor, new String[]{"imageActor","strActor"},new int[]{R.id.image_actor,R.id.txt_actor});
  //3、加载适配器
  ListView lv_actor = (ListView) findViewById(R.id.lv_actor);
  
  lv_actor.setAdapter(adapter);
  //4、设置列表项功能
  lv_actor.setOnItemClickListener(new OnItemClickListener() {

   @Override
   public void onItemClick(AdapterView<?> parent, View view, int postion,
     long id) {
    // TODO Auto-generated method stub
    
    
    Intent intent =new Intent(Intent.ACTION_VIEW);
    intent.setData(Uri.parse(urlActor[postion]));
    startActivity(intent);
   }
  });
  
  
 }

 @Override
 public boolean onCreateOptionsMenu(Menu menu) {
  // Inflate the menu; this adds items to the action bar if it is present.
  getMenuInflater().inflate(R.menu.actor, menu);
  return true;
 }

}
