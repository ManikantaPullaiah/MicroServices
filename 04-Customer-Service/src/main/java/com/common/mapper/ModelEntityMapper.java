package com.common.mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.common.entity.CustomerEntity;
import com.common.model.CustomerRequest;
import com.common.model.CustomerResponse;

@Component
public class ModelEntityMapper {

	public CustomerEntity customerRequestToCustomerEntity(CustomerRequest request) {
		CustomerEntity entity = new CustomerEntity();
		BeanUtils.copyProperties(request, entity);
		return entity;
	}

	public CustomerResponse customerEntityToCustomerResponse(CustomerEntity entity) {
		CustomerResponse response = new CustomerResponse();
		BeanUtils.copyProperties(entity, response);
		return response;
	}

}
