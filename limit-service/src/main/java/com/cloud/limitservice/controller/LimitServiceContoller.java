package com.cloud.limitservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.limitservice.bean.LimitConfigration;

@RestController
public class LimitServiceContoller {
	
	@GetMapping("/limits")
	public LimitConfigration retriveLimitConfigration()
	{
		return new LimitConfigration(1000,10);
		
	}

}
