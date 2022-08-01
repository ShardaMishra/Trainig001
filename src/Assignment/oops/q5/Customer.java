package com.josh.java.training.assignment.oops.q5;

import lombok.Data;

//imported data class to implement setter and getter method
@Data

//this is the super class of staff class and student class
public class Customer {

	private String name;
	private boolean member;
	private String memberType;

	public Customer(String name) {
		this.name = name;
	}
}
