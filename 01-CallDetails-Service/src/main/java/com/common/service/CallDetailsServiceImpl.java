package com.common.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.entity.CallDetailsEntity;
import com.common.mapper.ModelEntityMapper;
import com.common.model.CallDetails;
import com.common.repo.CallDetailsRepo;

@Service
public class CallDetailsServiceImpl implements CallDetailsService {

	@Autowired
	CallDetailsRepo repo;
	@Autowired
	ModelEntityMapper mapper;

	@Override
	public List<CallDetails> findCalldetailsFromNumber(Long fromNumber) {
		List<CallDetailsEntity> lstModelentites = repo.findByFromNumber(fromNumber);
		List<CallDetails> lstModels = new ArrayList<>();
		lstModelentites.forEach(entity -> {
			lstModels.add(mapper.calldetailsEntityToCalldetails(entity));
		});

		return lstModels;
	}

	@Override
	public boolean addCalldetails(CallDetails details) {

		CallDetailsEntity calldetails = mapper.calldetails(details);
		try {
			repo.save(calldetails);
			return true;
		} catch (Exception ex) {
			return false;
		}

	}

}
