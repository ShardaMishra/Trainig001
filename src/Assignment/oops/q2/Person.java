package com.josh.java.training.assignment.oops.q2;

import lombok.Data;

@Data
public class Person {
	private String name;
	private String address;

	Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}
}
