package com.example.lihongcheng.dao;

import java.util.ArrayList;
import java.util.List;

import com.example.lihongcheng.pojo.Review;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class ReviewDao {
	DbHelper dbHelper;
	
	public ReviewDao(Context context){
		this.dbHelper=new DbHelper(context);
	}
	public int add(Review review){
		int result=0;
		SQLiteDatabase db=dbHelper.getWritableDatabase();
		
		String sql= String.format("insert into review (author,date,content)values('%s','%s','%s');", 
				review.getAuthor(),review.getDate(),review.getContent());
		
		try{
			db.execSQL(sql);
			result=1;
		}catch (Exception e){
			e.printStackTrace();
		}finally{
			db.close();
		}
		return result;
	}
	public List<Review> select(){
		List<Review> list=new ArrayList<Review>();
		
		SQLiteDatabase db=dbHelper.getWritableDatabase();
		
		String sql="select * from review";
		
		Cursor c=null;
		try{
			c=db.rawQuery(sql,null);
			
			while(c.moveToNext()){
				Review review=new Review();
				review.setId(c.getInt(c.getColumnIndex("id")));
				review.setAuthor(c.getString(c.getColumnIndex("author")));
				review.setDate(c.getString(c.getColumnIndex("date")));
				review.setContent(c.getString(c.getColumnIndex("content")));
				list.add(review);
			}
			return list;
			
		}catch (Exception e){
			e.printStackTrace();
		}finally{
			c.close();
			db.close();
		}
		return null;
	}
}
