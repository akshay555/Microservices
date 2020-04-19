package com.cloud.limitservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LimitServiceApplication {

	public static void main(String[] args) {
	SpringApplication.run(LimitServiceApplication.class, args);
	System.out.println("Start Limit Service Application");
	}

}
