package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Democontro {
	
	@RequestMapping(value="/")
	public String method1() {
		return("hi");
	}

	
	
	
	System.out.println("hai);
}
