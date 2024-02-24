package com.common.service;

import com.common.model.CustomerRequest;
import com.common.model.CustomerResponse;
import com.common.model.LoginRequest;

public interface CustomerService {
	public boolean doRegistration(CustomerRequest request);
	public boolean doLogin(LoginRequest request);
	public CustomerResponse fetchProfile(Long phoneNumber);

}
