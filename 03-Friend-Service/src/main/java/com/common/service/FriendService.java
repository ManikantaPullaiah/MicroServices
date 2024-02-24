package com.common.service;

import java.util.List;

import com.common.entity.FriendEntity;

public interface FriendService {
	
	List<Long> readFriendsContacts(Long phoneNumber);
	boolean addFriendContact(FriendEntity entity);
}
