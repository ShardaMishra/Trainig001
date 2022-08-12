package com.josh.java.training.java8features;

import java.util.StringJoiner;

public class StringJoin {
	public static void main(String[] args) {

		StringJoiner mystring = new StringJoiner(",", "(", ")");

		mystring.add("Negan");
		mystring.add("Rick");
		mystring.add("Maggie");
		mystring.add("Daryl");

		// Displaying the output String
		System.out.println(mystring);
	}

}
