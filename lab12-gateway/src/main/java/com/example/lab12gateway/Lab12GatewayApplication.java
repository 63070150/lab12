package com.example.lab12gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Lab12GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab12GatewayApplication.class, args);
	}
}
