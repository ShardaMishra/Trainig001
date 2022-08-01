package com.josh.java.training.assignment.oops.driver;

import java.util.Date;
import java.util.Scanner;

import com.josh.java.training.assignment.oops.q2.Person;
import com.josh.java.training.assignment.oops.q2.Staff;
import com.josh.java.training.assignment.oops.q5.Customer;
import com.josh.java.training.assignment.oops.q5.Visit;

public class Driver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("2. Q2");
		System.out.println("5. Q5");
		System.out.print("Enter program no. to execute:");
		int input = scanner.nextInt();

		switch (input) {
		case 2:
			Person person = new Staff("Sharda", "Bihar", "dth", 543638);
			System.out.println(person);
			break;
		case 5:
			Customer customer = new Customer("Sharda");
			customer.setMember(true);
			customer.setMemberType("Premium");
			Visit visit = new Visit(customer, new Date());
			visit.setProductExpense(4.5);
			visit.setServiceExpense(8.5);
			visit.setProductExpense(1.5);
			System.out.println(visit.toString());
			System.out.println("Total expense made by " + visit.getCustomerName() + " = $" + visit.getTotalExpense());
			break;
		default:
			System.out.println("Enter valid program number //");
		}
		scanner.close();
	}

}
