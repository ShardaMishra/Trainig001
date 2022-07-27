package com.josh.java.training.assignment.controlstatement;

import java.util.Scanner;

public class AssignmentQ5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 15423;
		int rem = num % 10;
		String temp = "" + rem;
		num = num / 10;
		while (num != 0) {
			rem = num % 10;
			temp = temp + " " + rem;
			num = num / 10;
		}
		System.out.println(temp);
		sc.close();
	}

}
