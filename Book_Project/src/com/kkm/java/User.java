package com.kkm.java;

public class User {
	
	private String ID;
	private String PW;
	private String Name;
	
	public User(String id, String pw, String name){
		this.ID = id;
		this.PW = pw;
		Name = name;
	}
	
	public String getId() {
		return ID;
	}
	
	public void setId(String id) {
		this.ID = id;
	}
	
	public String getPw() {
		return PW;
	}
	
	public void setPw(String pw) {
		this.PW = pw;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		this.Name = name;
	}
	
	@Override
	public String toString() {
		return "ID : " + this.ID + " PW : " + this.PW + " Name : " + this.Name;
	}
}
