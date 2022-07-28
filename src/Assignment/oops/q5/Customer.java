package com.josh.java.training.assignment.oops.q5;

import lombok.Data;

//imported data class to implement setter and getter method
@Data

//this is the super class of staff class and student class
public class Customer {

	private String name;
	private boolean member = false;
	private String memberType;

	public Customer(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", member=" + member + ", memberType=" + memberType + "]";
	}

}
