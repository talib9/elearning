package com.amdocs.training.controller;

public class User {
	private String userid;
	private String name;
	private String password;
	private String phone;
	private String address;
	private String email;
	private String uploadImg;
	private String regDate;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String userid, String name, String password, String phone, String address, String email,
			String uploadImg, String regDate) {
		super();
		this.userid = userid;
		this.name = name;
		this.password = password;
		this.phone = phone;
		this.address = address;
		this.email = email;
		this.uploadImg = uploadImg;
		this.regDate = regDate;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUploadImg() {
		return uploadImg;
	}

	public void setUploadImg(String uploadImg) {
		this.uploadImg = uploadImg;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	
	


}
