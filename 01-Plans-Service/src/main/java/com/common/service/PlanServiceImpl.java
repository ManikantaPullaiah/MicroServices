package com.common.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.entity.PlanEntity;
import com.common.mapper.ModelEntityMapper;
import com.common.model.Plans;
import com.common.repo.PlansRepo;

@Service
public class PlanServiceImpl implements PlanService {

	@Autowired
	PlansRepo repo;
	@Autowired
	ModelEntityMapper mapper;

	@Override
	public List<Plans> fetchPlans() {
		
		return repo.findAll().stream().map(mapper::planEntityEntityToPlans).collect(Collectors.toList());
	}

	@Override
	public List<Plans> fetchPlansByMode(String mode) {
		List<PlanEntity> planEntites = repo.findAll();
		List<Plans> plans=new ArrayList<>();
				planEntites.forEach(entity->{
		plans.add(mapper.planEntityEntityToPlans(entity));
		});
				return plans;
	}

	@Override
	public Plans fetchPlanById(String planId) {
		return repo.findById(planId).map(mapper::planEntityEntityToPlans).get();
	}

}
