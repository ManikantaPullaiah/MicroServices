package com.common.service;

import java.util.List;

import com.common.model.Plans;

public interface PlanService {
	List<Plans> fetchPlans();
	List<Plans> fetchPlansByMode(String mode);
	Plans fetchPlanById(String planId);

}
