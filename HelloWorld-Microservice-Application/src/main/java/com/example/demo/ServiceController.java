package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

	@RequestMapping("/testService")
	public String helloMicroService() {
		return "Message From Spring Micro Service";
	}

}
