package com.common.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.common.constants.AppConstants;
import com.common.model.CustomerRequest;
import com.common.model.CustomerResponse;
import com.common.model.Friends;
import com.common.model.LoginRequest;
import com.common.model.Plans;
import com.common.service.CustomerService;

@RestController
public class CusotmerAPI {
	@Autowired
	CustomerService service;
	
	@Autowired
	RestTemplate template;
	
	@PostMapping("/customer/registration")
	public ResponseEntity<String> doRegistration(@RequestBody CustomerRequest request) {
		boolean flag = service.doRegistration(request);
		if (flag) {
			return new ResponseEntity<>(AppConstants.CUSTOMER_REGISTRATION_SUCCESS, HttpStatus.CREATED);
		} else {
			return new ResponseEntity(AppConstants.CUSTOMER_REGISTRATION_FAILED, HttpStatus.BAD_REQUEST);
		}
	}
	

	@PostMapping("/customer/login")
	public ResponseEntity<String> doLogin(@RequestBody LoginRequest reuqest) {
		boolean flag = service.doLogin(reuqest);
		if (flag) {
			return new ResponseEntity(AppConstants.CUSTOMER_LOGIN_SUCCESS, HttpStatus.CREATED);
		} else {
			return new ResponseEntity(AppConstants.CUSTOMER_LOGIN_FAILED, HttpStatus.BAD_REQUEST);
		}
	}

	@GetMapping("/customer/profile/{phoneNumber}")
	public ResponseEntity<CustomerResponse> fetchProfile(@PathVariable Long phoneNumber) {
		CustomerResponse response = service.fetchProfile(phoneNumber);
		
		  CustomerResponse responses = service.fetchProfile(phoneNumber);
		  RequestEntity<Void> reqEntity =
		  RequestEntity.get(AppConstants.CUSTOMER_PLAN_URL +"?planId="+ response.getPlanId())
		  .accept(MediaType.APPLICATION_JSON).build(); ResponseEntity<Plans> resEntity
		  = template.exchange(reqEntity, Plans.class);
		  response.setPlanData(resEntity.getBody());
		return ResponseEntity.ok(response);
		 
		
		
			/*
			 * ParameterizedTypeReference<Friends> tyepRef=new
			 * ParameterizedTypeReference<Friends>(){ };
			 * 
			 * RequestEntity<Void>
			 * friendEntity=RequestEntity.get(AppConstants.CUSTOMER_FRIEND_URL,phoneNumber)
			 * .accept(MediaType.APPLICATION_JSON).build(); ResponseEntity<Friends>
			 * res=template.exchange(friendEntity, tyepRef); Friends friends =res.getBody();
			 * response.setFriend(friends); retespourn RnseEntity.ok(response);
			 */
		

	}


}
