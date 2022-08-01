package com.josh.java.training.oopsassignment;


	
		import java.util.Date;
		import java.util.Scanner;
		
		public class MyClass {

			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				System.out.println("2. Q2");
				System.out.println("5. Q5");
				System.out.print("Enter program no. to execute:");
				int input=sc.nextInt();
				
				switch(input) {
				case 2:	Person p=new Staff("Sharda", "Bihar", "dth",543638);
						System.out.println(p);
						break;
				case 5:	Customer c1 = new Customer("Sharda");
						c1.member=true;
						c1.memberType="Premium";
						Visit v1 = new Visit(c1, new Date());
						v1.setProductExpense(4.5);
						v1.setServiceExpense(8.5);
						v1.setProductExpense(1.5);
						System.out.println(v1.toString());
						System.out.println("Total expense made by " + v1.getCustomerName() + " = $" + v1.getTotalExpense());
						break;
				default:System.out.println("Enter valid program number //");
				}
			}

		


	}

