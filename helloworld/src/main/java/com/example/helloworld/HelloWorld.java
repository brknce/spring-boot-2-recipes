package com.example.helloworld;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {

	@PostConstruct
	public void sayHello() {
		System.out.println("Hello world, from Spring Boot 2!");
	}
}
