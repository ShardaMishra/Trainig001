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
			Customer customer1 = new Customer("Sharda");
			customer1.setMember (true);
			customer1.setMemberType  ("Premium");
			Visit visit1 = new Visit(customer1, new Date());
			visit1.setProductExpense(4.5);
			visit1.setServiceExpense(8.5);
			visit1.setProductExpense(1.5);
			System.out.println(visit1.toString());
			System.out.println("Total expense made by " + visit1.getCustomerName() + " = $" + visit1.getTotalExpense());
			break;
		default:
			System.out.println("Enter valid program number //");
		}
		scanner.close();
	}

}
