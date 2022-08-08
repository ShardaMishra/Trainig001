package com.josh.java.training.collection.comparableorcomparator;

import java.util.ArrayList;
import java.util.Collections;

public class comparableExample {
	public static void main(String[] args) {
		Employee emp1 = new Employee("Akash", 35);
		Employee emp2 = new Employee("Sharda", 21);
		Employee emp3 = new Employee("Bharat", 23);
		Employee emp4 = new Employee("Subhra", 24);
		Employee emp5 = new Employee("Gireesh", 26);

		// Create a Array list
		ArrayList<Employee> arrayList = new ArrayList();
		arrayList.add(emp1);
		arrayList.add(emp2);
		arrayList.add(emp3);
		arrayList.add(emp4);
		arrayList.add(emp5);

		// Sort the List
		Collections.sort(arrayList);
		System.out.println(arrayList);

	}
}
