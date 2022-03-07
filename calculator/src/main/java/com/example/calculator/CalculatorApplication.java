package com.example.calculator;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);
	}

	@Bean
	public ApplicationRunner calculation(Calculator calculator) {
		return args -> {
			calculator.calculate(127, 13, '+');
			calculator.calculate(127, 13, '*');
			calculator.calculate(127, 13, '-');
		};
	}
}
