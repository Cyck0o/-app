package com.example.lihongcheng.adapter;

import java.util.List;

import com.example.lihongcheng.R;
import com.example.lihongcheng.pojo.Role;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class RoleAdapter extends ArrayAdapter<Role>{
 int resource;
 
 
 public RoleAdapter(Context context, int resource,List<Role> objects) {
  super(context, resource, objects);
  // TODO Auto-generated constructor stub
  this.resource = resource;
 }

 @Override
 public View getView(int position, View convertView, ViewGroup parent) {
  // TODO Auto-generated method stub
  //return super.getView(position, convertView, parent);
  
  View view=LayoutInflater.from(getContext()).inflate(resource, null);
  
  //获取当前项数据
  
  Role role = getItem(position);
  
  //匹配模板控件和数据
  
  ImageView image_role = (ImageView) view.findViewById(R.id.image_role);
  
  TextView txt_role_name = (TextView) view.findViewById(R.id.txt_role_name);
  
  TextView txt_role_actor = (TextView) view.findViewById(R.id.txt_role_actor);
  
  TextView txt_role_info = (TextView) view.findViewById(R.id.txt_role_info);
  
  image_role.setImageResource(role.getRoleImage());
  
  txt_role_name.setText(role.getRoleName());
  
  txt_role_actor.setText(role.getRoleActor());
  
  txt_role_info.setText(role.getRoleInfo());
  
  
  
  return view;
  
  
 }
 


}
