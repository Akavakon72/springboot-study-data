package com.study.springboot.start.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {
	
	@RequestMapping("/message")
	public String getMessage() {
		return "Hello World";
	}

}
