package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")


public class HelloWorldControlller {
	
	@GetMapping
	public String helloworld() {
		return "hello world";
		
	}
}   