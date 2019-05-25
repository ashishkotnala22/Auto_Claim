package com.cts.model;

public class Officer {

	
	private String name;
	private long mobileNumber;
	private String password;
	private String email;
	private long aadharNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}
	public Officer(String name, long mobileNumber, String password, String email, long aadharNo) {
		super();
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.password = password;
		this.email = email;
		this.aadharNo = aadharNo;
	}
	public Officer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
