package com.example.lihongcheng.pojo;

public class Review {
	private int id;
	private String author;
	private String date;
	private String content;
	public Review(){
		super();
	}
	public Review(int id,String author,String date,String content){
		super();
		this.id=id;
		this.author=author;
		this.date=date;
		this.content=content;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
