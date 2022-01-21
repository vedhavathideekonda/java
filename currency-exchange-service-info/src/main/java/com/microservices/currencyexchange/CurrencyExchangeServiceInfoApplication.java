package com.microservices.currencyexchange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication

public class CurrencyExchangeServiceInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchangeServiceInfoApplication.class, args);
	}

}
