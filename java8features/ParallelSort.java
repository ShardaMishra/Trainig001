package com.josh.java.training.java8features;

import java.util.Arrays;

public class ParallelSort {
	public static void main(String[] args) {
		// Creating an array
		int numbers[] = { 9, 8, 7, 6, 3, 1 };
		System.out.print("Unsorted Array: ");

		// Iterating the Elements using stream
		Arrays.stream(numbers).forEach(n -> System.out.print(n + " "));
		System.out.println();

		// Using Arrays.parallelSort()
		Arrays.parallelSort(numbers);

		System.out.print("Sorted Array: ");
		// Iterating the Elements using stream
		Arrays.stream(numbers).forEach(n -> System.out.print(n + " "));
	}
}
