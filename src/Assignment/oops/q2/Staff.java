package com.josh.java.training.assignment.oops.q2;

import lombok.Data;

//imported data class to implement setter and getter method
@Data
public class Staff extends Person {
	private String school;
	private double pay;

	public Staff(String name, String address, String school, double pay) {
		super(name, address);
		this.school = school;
		this.pay = pay;
	}

	@Override
	public String toString() {
		return "Staff[Person [name=" + super.getName() + ", address=" + super.getAddress() + "[ name=" + getName()
				+ ", address=" + getAddress() + ", school=" + school + ", pay=" + pay + " ]";
	}
}
