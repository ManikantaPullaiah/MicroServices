package com.common.service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.entity.FriendEntity;
import com.common.repo.FriendsRepo;

@Service
public class FriendServiceImpl implements FriendService {

	@Autowired
	FriendsRepo repo;
	@Override
	public List<Long> readFriendsContacts(Long phoneNumber) {
		return repo.fetchFriendContacts(phoneNumber);
	}

	@Override
	public boolean addFriendContact(FriendEntity entity) {
	BigInteger status = repo.isFriendContactExists(entity.getPhoneNumber(), entity.getFriendNumber());
	if(status.intValue()==0)
	{
		repo.save(entity);
		return true;
	}else
	{
		return false;
	}
		
	}

}
