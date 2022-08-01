package com.josh.java.training.exceptionhandling;
import java.util.Scanner;
public class DaySeven {

	public static void main(String[] args) {
		
		try {
			int [] myNumbers= {1,3,4};
			System.out.println(myNumbers[10]);
			}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("something went wrong");
			}
		finally {
			System.out.println("Bye....");
		}
		
		int age=20;
		if(age<25) {
			NoEntryException c=new NoEntryException("Kid not allowed");
			throw c;
		}
		else {
			System.out.println("welcome");
		}

	}
}
