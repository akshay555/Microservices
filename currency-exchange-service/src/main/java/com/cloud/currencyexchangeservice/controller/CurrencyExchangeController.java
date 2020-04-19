package com.cloud.currencyexchangeservice.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.currencyexchangeservice.bean.ExchangeValue;
import com.cloud.currencyexchangeservice.service.ExchangeValueRepository;

@RestController
public class CurrencyExchangeController {
	
	@Autowired
	Environment env;
	
	@Autowired
	ExchangeValueRepository repository;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retriveExchangeValue(@PathVariable("from") String from,@PathVariable("to") String to)
	{
		
		/*
		 * ExchangeValue exchange = new
		 * ExchangeValue(121l,"USD","INR",BigDecimal.valueOf(65.00));
		 * exchange.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		 * return exchange;
		 */
		ExchangeValue exchange =	repository.findByFromAndTo(from, to);
		
		/*
		 * List<ExchangeValue> exchange = repository.findAll(); return exchange;
		 */
		return exchange;
		
	}

}
