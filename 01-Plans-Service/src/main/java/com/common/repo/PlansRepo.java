package com.common.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.common.entity.PlanEntity;

public interface PlansRepo extends JpaRepository<PlanEntity, String> {
List<PlanEntity>	findByMode(String mode);

}
