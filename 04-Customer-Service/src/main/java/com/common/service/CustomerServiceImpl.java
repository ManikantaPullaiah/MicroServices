package com.common.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.entity.CustomerEntity;
import com.common.mapper.ModelEntityMapper;
import com.common.model.CustomerRequest;
import com.common.model.CustomerResponse;
import com.common.model.LoginRequest;
import com.common.repo.CustomerEntityRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerEntityRepository repo;

	@Autowired
	private ModelEntityMapper mapper;
	@Override
	public boolean doRegistration(CustomerRequest request) {
		if (!repo.existsById(request.getPhoneNumber())) {
			CustomerEntity entites = mapper.customerRequestToCustomerEntity(request);
			repo.save(entites);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean doLogin(LoginRequest request) {
		int rowCount = repo.authenticate(request.getPhoneNumber(), request.getPassword());
		if (rowCount == 1) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public CustomerResponse fetchProfile(Long phoneNumber) {
		Optional<CustomerEntity> opt = repo.findById(phoneNumber);
		CustomerResponse response = null;
		if (opt.isPresent()) {
			response = mapper.customerEntityToCustomerResponse(opt.get());
		}
		return response;
	}
	}

