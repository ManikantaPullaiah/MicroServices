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

import com.common.model.CallDetails;
import com.common.service.CallDetailsService;

@RestController
public class CallDetailsController {

	@Autowired
	CallDetailsService service;

	@GetMapping("/calldetails/{fromNumber}")
	public ResponseEntity<List<CallDetails>> fetchCallDetails(@PathVariable Long fromNumber) {
		List<CallDetails> lstCalldetails = service.findCalldetailsFromNumber(fromNumber);
		return ResponseEntity.ok(lstCalldetails);
	}

	@PostMapping("/calldetails/add")
	public ResponseEntity<String> addCalldetails(@RequestBody CallDetails details) {
		boolean status = service.addCalldetails(details);
		if (status) {
			return new ResponseEntity("Calldetails are added succesfully", HttpStatus.CREATED);
		} else {
			return new ResponseEntity("Calldetails are not added succesfully", HttpStatus.BAD_REQUEST);
		}
	}
}
