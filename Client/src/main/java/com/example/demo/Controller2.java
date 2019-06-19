package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/rest/client")
public class Controller2 {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping
	public String hello() {
		String url="http://client-1/rest";
		return restTemplate.getForObject(url, String.class);
		
	}
	
}
