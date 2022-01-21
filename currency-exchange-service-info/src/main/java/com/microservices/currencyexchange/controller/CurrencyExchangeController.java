package com.microservices.currencyexchange.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.currencyexchange.bean.ExchangeValue;
import com.microservices.currencyexchange.repository.ExchangeValueRepository;

@RestController
public class CurrencyExchangeController {
	@Autowired
	private Environment environment;
	@Autowired
	private ExchangeValueRepository repo;
	
@GetMapping("/currencyexchange/from/{from}/to/{to}")
	protected ExchangeValue retreiveExchangeValue(@PathVariable String from,@PathVariable String to) {
     
	ExchangeValue exchangeValue= repo.findByFromAndTo(from, to);
	exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
	return exchangeValue;
	}
}
