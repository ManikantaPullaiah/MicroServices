package com.common.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.common.model.Plans;
import com.common.service.PlanService;

import jakarta.websocket.server.PathParam;

@RestController
public class PlanController {
	
	@Autowired
	PlanService service;
	
	@GetMapping("/plans/all")
	public ResponseEntity<List<Plans>> getAllPlans()
	{
		return new ResponseEntity<List<Plans>>(service.fetchPlans(),HttpStatus.OK);
	}
	
	@GetMapping("/plans/{mode}")
	public ResponseEntity<List<Plans>> getAllPlans(@PathVariable String mode)
	{
		return new ResponseEntity<List<Plans>>(service.fetchPlansByMode(mode),HttpStatus.OK);
	}

	@GetMapping("/plans")
	public ResponseEntity<Plans> getPlanById(@RequestParam String planId)
	{
		return new ResponseEntity<Plans>(service.fetchPlanById(planId),HttpStatus.OK);
	}
}
