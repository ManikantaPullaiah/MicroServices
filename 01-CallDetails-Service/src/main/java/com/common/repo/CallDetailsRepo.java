package com.common.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.common.entity.CallDetailsEntity;

public interface CallDetailsRepo extends JpaRepository<CallDetailsEntity, Integer> {
   List<CallDetailsEntity> findByFromNumber(Long fromNumber);
}
