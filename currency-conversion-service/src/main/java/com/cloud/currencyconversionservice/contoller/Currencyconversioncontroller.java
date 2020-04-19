package com.cloud.currencyconversionservice.contoller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cloud.currencyconversionservice.bean.CurrencyconversionDTO;


@RestController
public class Currencyconversioncontroller {
	
	

	@GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyconversionDTO convertCurrency(@PathVariable("quantity") BigDecimal quantity,@PathVariable("from") String from,@PathVariable("to") String to)
	{
		Map<String,String> input = new HashMap<String,String>();
		input.put("from",from);
		input.put("to",to);
		ResponseEntity<CurrencyconversionDTO> conversionObj =	new RestTemplate().getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}", CurrencyconversionDTO.class,input);
		
		CurrencyconversionDTO obj =conversionObj.getBody();
		return new  CurrencyconversionDTO(obj.getId(),obj.getFrom(), obj.getTo(), obj.getConversionMultiple(), quantity
				,quantity.multiply(obj.getConversionMultiple())	,obj.getPort());
	}
}
