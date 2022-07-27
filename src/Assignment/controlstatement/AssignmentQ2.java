package com.josh.java.training.assignment.controlstatement;

import java.util.Scanner;

public class AssignmentQ2 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter a");
		int a=sc.nextInt();

		System.out.println("enter b");
		int b=sc.nextInt();

		System.out.println("enter n");
		int n=sc.nextInt();

		int sum=0;
		for(int i=0;i<=n-1;i++)
		{
			sum=a;
			for(int j=0;j<=i;j++)
			{
				sum=sum+((int)Math.pow(2,j)*b);


			}
			System.out.println(sum+" ");
		}




	}

}
