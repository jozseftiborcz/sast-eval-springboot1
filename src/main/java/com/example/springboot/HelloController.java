package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index(String data) {
		return "Greetings from Spring Boot!" + data;
	}

	@RequestMapping("/foo")
	public String foo(String data) {
		return BarController.echoer(data);
	}
}
