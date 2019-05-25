package com.cts.model;

public class Claim {
	
	private String policyNo;
	private String insuredName;
	private String address;
	private String email;
	private String registrationNo;
	private String mobileNum;
	private String age;
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getInsuredName() {
		return insuredName;
	}
	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
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
	public String getRegistrationNo() {
		return registrationNo;
	}
	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}
	public String getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public Claim(String policyNo, String insuredName, String address, String email, String registrationNo,
			String mobileNum, String age) {
		super();
		this.policyNo = policyNo;
		this.insuredName = insuredName;
		this.address = address;
		this.email = email;
		this.registrationNo = registrationNo;
		this.mobileNum = mobileNum;
		this.age = age;
	}
	public Claim() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
