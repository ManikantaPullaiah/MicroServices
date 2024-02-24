package com.common.model;

public class CustomerRequest {
	
	private Long phoneNumber;
	private String fullName;
	private String email;
	private String password;
	private String planId;
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPlanId() {
		return planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}
	@Override
	public String toString() {
		return "CustomerRequest [phoneNumber=" + phoneNumber + ", fullName=" + fullName + ", email=" + email
				+ ", password=" + password + ", planId=" + planId + "]";
	}
	
	

}
