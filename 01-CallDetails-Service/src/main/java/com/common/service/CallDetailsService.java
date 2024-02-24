package com.common.service;

import java.util.List;

import com.common.model.CallDetails;

public interface CallDetailsService {
	  List<CallDetails> findCalldetailsFromNumber(Long fromNumber);
	  boolean addCalldetails(CallDetails details);

}
