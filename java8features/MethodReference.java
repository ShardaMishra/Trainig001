package com.josh.java.training.java8features;

interface Calculator {
	void add(int num1, int num2);
}

class Calc {
	public static void addSomething(int num1, int num2) {
		System.out.println(num1 + " and " + num2 + " addition is: " + (num1 + num2));
	}

	public void letsAdd(int num1, int num2) {
		System.out.println(num1 + " and " + num2 + " adds to:" + (num1 + num2));
	}
}

//Functional interface
interface Messenger {
	Message getMessage(String msg);
}

class Message {
	Message(String msg) {
		System.out.println(" Message is:" + msg);
	}
}

public class MethodReference {

	public static void main(String[] args) {

		Calc.addSomething(10, 20);
		Calculator c = Calc::addSomething;// Method Reference
		c.add(11, 14);

		Calc calc = new Calc();
		Calculator c1 = calc::letsAdd;// Method Reference
		c1.add(12, 23);

		Messenger m = Message::new;// Method Reference
		m.getMessage("Where there is a will there is a way");

	}

}
