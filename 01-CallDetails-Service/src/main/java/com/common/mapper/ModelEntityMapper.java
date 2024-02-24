package com.common.mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.common.entity.CallDetailsEntity;
import com.common.model.CallDetails;
@Component
public class ModelEntityMapper {
	
	
	public CallDetails calldetailsEntityToCalldetails(CallDetailsEntity entity)
	{
		CallDetails calldetails=new CallDetails();
		BeanUtils.copyProperties(entity, calldetails);
		return calldetails;
	}
	
	
	public CallDetailsEntity calldetails(CallDetails details)
	{
		CallDetailsEntity entity=new CallDetailsEntity();
		BeanUtils.copyProperties(details, entity);
		return entity;
	}

}
