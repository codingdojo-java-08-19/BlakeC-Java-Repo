package com.codingdojo.routing.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {

	@RequestMapping("{location}")
	public String dojo(@PathVariable("location") String location) {
		if(location.equals("dojo")) {
			return "The Dojo cool";
		}
		if(location.equals("online")) {
			return "Online is located around the world";
		}
		if(location.equals("Tulsa")) {
			return "T-Town";
		}
		return "";
	}	
}