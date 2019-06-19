package com.micro.eureka;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class Controller1 {

	@GetMapping
	public String getClient() {
		return "client-1";
	}
	
}
