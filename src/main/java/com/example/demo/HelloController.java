package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/hello")
	String hello() {
		return "<h1>Hello World, Spring Boot!</h1>";
	}
	@RequestMapping("/porn")
	String pornStar() {
		return "<h1>Dani Daniels,Charlee Grey Most Sexiest Porn Stars!</h1>";
	}

}
