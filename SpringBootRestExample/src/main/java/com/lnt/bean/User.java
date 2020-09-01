package com.lnt.bean;

public class User {
	private Integer uid;
	private String name;
	private String email;
	public User(Integer uid, String name, String email) {
		super();
		this.uid = uid;
		this.name = name;
		this.email = email;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getUid() {
		return uid;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	
}
