package com.codingdojo.routing.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding")
public class CodingController {
	
	@RequestMapping("")
	public String hello() {
		return "Hello MOTO";
	}
	
	@RequestMapping("/python") 
	public String python() {
		return "Python kinda cool";
	}
	
	@RequestMapping("/java")
	public String java() {
		return "Java is way better!";
	}
}