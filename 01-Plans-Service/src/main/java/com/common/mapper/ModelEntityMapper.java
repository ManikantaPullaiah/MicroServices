package com.common.mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.common.entity.PlanEntity;
import com.common.model.Plans;

@Component
public class ModelEntityMapper {

	public Plans planEntityEntityToPlans(PlanEntity entity) {
		Plans plans = new Plans();
		BeanUtils.copyProperties(entity, plans);
		return plans;
	}

}
