package com.example.calculator;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

	private final List<Operation> operations;

	public Calculator(List<Operation> operations) {
		this.operations = operations;
	}

	public void calculate(int lhs, int rhs, char op) {
		for (var operation : operations) {
			if (operation.handles(op)) {
				var result = operation.apply(lhs, rhs);
				System.out.printf("%d %s %d = %s%n", lhs, op, rhs, result);
				return;
			}
		}
		throw new IllegalArgumentException("Unknown operation " + op);
	}
}
