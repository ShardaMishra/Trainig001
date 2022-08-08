package com.josh.java.training.collection.comparableorcomparator;

import java.util.ArrayList;
import java.util.Collections;

public class comparatorExample {
	public static void main(String[] args) {
		Employee emp1 = new Employee("Akash", 35);
		Employee emp2 = new Employee("Sharda", 21);
		Employee emp3 = new Employee("Bharat", 23);
		Employee emp4 = new Employee("Subhra", 24);
		Employee emp5 = new Employee("Gireesh", 26);

		// Create a Array list
		ArrayList<Employee> arrayList = new ArrayList<Employee>();
		arrayList.add(emp1);
		arrayList.add(emp2);
		arrayList.add(emp3);
		arrayList.add(emp4);
		arrayList.add(emp5);

		// Sort the array
		// using Comparable
		Collections.sort(arrayList); 
		System.out.println("sortbyage");
		for(Employee x:arrayList) {
			System.out.print(x+"\t");
		}
		System.out.println();

		// Sort based on Name Comparator
		Collections.sort(arrayList, new SortByName());
		System.out.println("sortbyname");
		for(Employee x:arrayList) {
			System.out.print(x+"\t");
		}

	}

}
