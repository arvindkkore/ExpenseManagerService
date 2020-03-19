package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpenseController {

	@GetMapping("sayHello")
	public String sayHello() {
		return "hello";
	}
	
}
