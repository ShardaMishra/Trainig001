package com.josh.java.training.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Filter {
	public static void main(String[] args) {
		// List list = List.of(1,2,3,5,6,7,8);
		List<Integer> list = Arrays.asList(1, 2, 3, 5, 6, 7, 8);
		List<Integer> list1 = list.stream().filter(x -> x > 1).collect(Collectors.toList());
		System.out.println(list1);

		list.stream().filter(x -> x > 1).collect(Collectors.toList()).forEach(x -> System.out.println(x));

	}

}
