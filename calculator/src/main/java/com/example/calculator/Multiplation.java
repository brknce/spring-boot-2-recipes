package com.example.calculator;

import org.springframework.stereotype.Component;

@Component
public class Multiplation implements Operation {

	@Override
	public int apply(int lhs, int rhs) {
		return lhs * rhs;
	}

	@Override
	public boolean handles(char op) {
		return '*' == op;
	}

}
