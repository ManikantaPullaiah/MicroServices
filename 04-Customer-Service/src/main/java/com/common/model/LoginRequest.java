package com.common.model;

public class LoginRequest {
	private Long phoneNumber;
	private String password;
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginRequest [phoneNumber=" + phoneNumber + ", password=" + password + "]";
	}
	
	
}