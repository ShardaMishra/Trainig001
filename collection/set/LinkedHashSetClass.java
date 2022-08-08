package com.josh.java.training.collection.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetClass {
	public static void main(String[] args) {
		// LinkedHashSet remembers the order you added items in
		Set<String> set1 = new LinkedHashSet<String>();

		if (set1.isEmpty()) {
			System.out.println("Set is empty at start");
		}

		set1.add("dog");
		set1.add("cat");
		set1.add("mouse");
		set1.add("snake");
		set1.add("bear");

		if (set1.isEmpty()) {
			System.out.println("Set is empty after adding (no!)");
		}

		// Adding duplicate items does nothing.
		set1.add("mouse");

		System.out.println(set1);

		for (String element : set1) {
			System.out.println(element);
		}

		// Does set contains a given item?
		if (set1.contains("aardvark")) {
			System.out.println("Contains aardvark");
		}

		if (set1.contains("cat")) {
			System.out.println("Contains cat");
		}

	}

}
