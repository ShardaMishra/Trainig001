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
		int count = 0;
		for (String str : names) {
			if (str.length() < 6)
				count++;
		}
		System.out.println("There are " + count + " strings with length less than 6");
	}

}
