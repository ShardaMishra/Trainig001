package com.josh.java.training.java8features;

import java.util.ArrayList;
import java.util.List;

public class Stream {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Bharat");
		names.add("Subhra");
		names.add("Gireesh");
		names.add("Sharda");

		long count = names.stream().filter(str -> str.length() > 5).count();
		System.out.println("There are " + count + " strings with length less than 6");
	}

}
