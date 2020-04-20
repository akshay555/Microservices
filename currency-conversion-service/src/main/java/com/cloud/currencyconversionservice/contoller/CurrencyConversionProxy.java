package com.cloud.currencyconversionservice.contoller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cloud.currencyconversionservice.bean.CurrencyconversionDTO;

@FeignClient(name="currency-exchange-service", url="localhost:8000")
public interface CurrencyConversionProxy {

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyconversionDTO retriveExchangeValue(@PathVariable("from") String from,@PathVariable("to") String to);
	
	
}
