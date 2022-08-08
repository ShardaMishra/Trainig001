package com.josh.java.training.collection.comparableorcomparator;

public class Employee implements Comparable<Employee> {

	String name;
	int age;

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return this.name + " " + this.age;
	}

	@Override
	public int compareTo(Employee o) {

		if (this.age < o.age) {
			return -1;
		} else if (this.age == o.age) {
			return 0;
		} else {
			return 1;
		}
	}

	

}
