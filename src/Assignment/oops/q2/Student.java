package com.josh.java.training.assignment.oops.q2;

import lombok.Data;

//imported data class to implement setter and getter method
@Data
public class Student extends Person {
	private String program;
	private int year;
	private double fee;

	Student(String name, String address, String program, int year, double fee) {
		super(name, address);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}

	@Override 
	public String toString() {
		return "Student[Person [name=" + super.getName() + ", address=" + super.getAddress() + "[name=" + this.getName() + ", address=" + getAddress() + "program=" + program + ", year=" + year
				+ ", fee=" + fee + "]";
	}
}
