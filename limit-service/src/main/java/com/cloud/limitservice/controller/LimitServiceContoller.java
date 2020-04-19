package com.cloud.limitservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.limitservice.bean.LimitConfigration;
import com.cloud.limitservice.bean.LimitDTO;

@RestController
public class LimitServiceContoller {
	
	@Autowired
	LimitConfigration config;
	
	@GetMapping("/limits")
	public LimitDTO retriveLimitConfigration()
	{
		return new LimitDTO(config.getMaximum(),config.getMinimum());
		
	}

}
