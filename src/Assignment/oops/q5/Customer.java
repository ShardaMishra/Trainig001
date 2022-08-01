package com.josh.java.training.assignment.oops.q5;

import lombok.Data;

@Data

public class Customer {

	private String name;
	private boolean member;
	private String memberType;

	public Customer(String name) {
		this.name = name;
	}
}
