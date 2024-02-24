package com.common.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.common.entity.FriendEntity;
import com.common.service.FriendService;

@RestController
public class FriendController {

	@Autowired
	FriendService service;

	@GetMapping("/friends/{phoneNumber}")
	public ResponseEntity<List<Long>> getFriendsContacts(@PathVariable Long phoneNumber) {
		return new ResponseEntity<List<Long>>(service.readFriendsContacts(phoneNumber), HttpStatus.OK);
	}

	@PostMapping("/friends/add")
	public ResponseEntity<String> addFriends(@RequestBody FriendEntity entity) {
		boolean status = service.addFriendContact(entity);
		if (status) {
			return new ResponseEntity<String>("friends deails added successfully", HttpStatus.CREATED);
		} else {
			return new ResponseEntity<String>("friends details are not added successfully", HttpStatus.BAD_REQUEST);
		}
	}

}
