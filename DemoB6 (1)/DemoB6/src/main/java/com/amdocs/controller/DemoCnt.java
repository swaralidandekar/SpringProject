package com.amdocs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoCnt {
	@GetMapping("/get")
	public String show()
	{
		return "Welcome to spring boot and jenkins";
	}

}
