package com.cloud.currencyexchangeservice.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cloud.currencyexchangeservice.bean.ExchangeValue;

public interface ExchangeValueRepository  extends JpaRepository<ExchangeValue, Long>{

	ExchangeValue findByFromAndTo(String from,String to);
	
	ExchangeValue findByFrom(String from);
	
	ExchangeValue findByTo(String to);
	
	ExchangeValue findByPort(int port);
	
}

