package com.micro.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EClient1Application {

	public static void main(String[] args) {
		SpringApplication.run(EClient1Application.class, args);
	}

}
