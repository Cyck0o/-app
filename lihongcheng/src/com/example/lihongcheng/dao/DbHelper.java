package com.example.lihongcheng.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper  extends SQLiteOpenHelper{
	public DbHelper(Context context){
		super(context,"review.db",null,1);
	}
	public void onCreate(SQLiteDatabase db){
		String sql = "CREATE TABLE REVIEW (id INTEGER PRIMARY KEY AUTOINCREMENT,"+"author TEXT NOT NULL,date TEXT NOT NULL,content TEXT NOT NULL)";
		
		db.execSQL(sql);
	}
	public void onUnpgrade(SQLiteDatabase arg0, int arg1,int arg2){
		
	}
	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}
	
}
