package com.example.springboot;

public class BarController {

	public String index(String data) {
		return "Greetings from Spring Boot!" + data;
	}

	public String foo(String data) {
		return "Greetings from Spring Boot!" + data;
	}

	public static String echoer(String data) {
		return "Greetings from Spring Boot!" + data;
	}
}
