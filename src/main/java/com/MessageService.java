package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageService {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hi, this is nilesh";
	}
	
	
	@GetMapping("/test")
	public String TestMessage1() {
		return "Test Successful!";
	}
		
}