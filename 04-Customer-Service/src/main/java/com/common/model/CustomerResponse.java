package com.common.model;

public class CustomerResponse {
	
	private Long phoneNumber;
	private String fullName;
	private String email;
	private String planId;
	private Plans planData;
	private Friends friend;
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
	public String getPlanId() {
		return planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}
	public Plans getPlanData() {
		return planData;
	}
	public void setPlanData(Plans planData) {
		this.planData = planData;
	}
	public Friends getFriend() {
		return friend;
	}
	public void setFriend(Friends friend) {
		this.friend = friend;
	}
	@Override
	public String toString() {
		return "CusotmerResponse [phoneNumber=" + phoneNumber + ", fullName=" + fullName + ", email=" + email
				+ ", planId=" + planId + ", planData=" + planData + ", friend=" + friend + "]";
	}
	
	
	
	
	

}