package com.cts.model;

import java.util.Date;

public class Vechile {

	
	
	private String name;
	private long pNUmber;
	private String address;
	private String email;
	private long aadharNo;
	private String vechileNumber;
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getpNUmber() {
		return pNUmber;
	}
	public void setpNUmber(long pNUmber) {
		this.pNUmber = pNUmber;
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
	public long getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getVechileNumber() {
		return vechileNumber;
	}
	public void setVechileNumber(String vechileNumber) {
		this.vechileNumber = vechileNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Vechile(String name, long pNUmber, String address, String email, long aadharNo, String vechileNumber,
			String password) {
		super();
		this.name = name;
		this.pNUmber = pNUmber;
		this.address = address;
		this.email = email;
		this.aadharNo = aadharNo;
		this.vechileNumber = vechileNumber;
		this.password = password;
	}
	public Vechile() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
