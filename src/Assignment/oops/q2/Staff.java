package com.josh.java.training.assignment.oops.q2;

import lombok.Data;

@Data
@tostring(callsuper=true)
public class Staff extends Person {
	private String school;
	private double pay;

	public Staff(String name, String address, String school, double pay) {
		super(name, address);
		this.school = school;
		this.pay = pay;
	}
}	

	
