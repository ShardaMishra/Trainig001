package com.josh.java.training.assignment.controlstatement;

public class AssignmentQ9d {

	public static void main(String[] args) {

		int num=8;
		for(int a=1;a<=8;a++)
		{
			for(int b=1;b<=8;b++)
			{
				if(a+b>=9)
				{
					System.out.print("#");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
