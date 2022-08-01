package com.josh.java.training.assignment.oops.q2;

import lombok.Data;


@Data
@tostring(callsuper=true)
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

}
