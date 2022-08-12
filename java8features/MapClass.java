package com.josh.java.training.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapClass {
	public static void main(String[] args) {
		// List list = List.of(1,2,3,5,6,7,8);
		List<Integer> list = Arrays.asList(1, 2, 3, 5, 6, 7, 8);
		Set<Integer> set = list.stream().map(x -> x * x).collect(Collectors.toSet());
		System.out.println(set);

	}

}
