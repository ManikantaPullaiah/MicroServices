package com.common.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.common.entity.CustomerEntity;

public interface CustomerEntityRepository extends JpaRepository<CustomerEntity, Long> {


	@Query(value = "select count(*) from customers where phone_number=? and password=?", nativeQuery = true)
	int authenticate(Long phoneNumber,String password);

}
