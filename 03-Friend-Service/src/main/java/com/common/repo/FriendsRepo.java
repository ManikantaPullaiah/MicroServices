package com.common.repo;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.common.entity.FriendEntity;

public interface FriendsRepo extends JpaRepository<FriendEntity, Integer> {

	@Query(value = "SELECT FRIEND_NUMBER FROM FRIENDSS WHERE PHONE_NUMBER=?", nativeQuery = true)
	List<Long> fetchFriendContacts(Long phoneNumber);

	@Query(value = "SELECT EXISTS (SELECT 1 FROM FRIENDSS WHERE PHONE_NUMBER=? AND FRIEND_NUMBER=?)", nativeQuery = true)
	BigInteger isFriendContactExists(Long phoneNumber, Long friendNumber);

}