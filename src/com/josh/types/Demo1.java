package com.josh.types;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter year");
		int y=sc.nextInt();
		if(y%400==0)
		{
			System.out.println("leap year");
		}
		else if(y%4==0 && y%100!=0)
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println("not a leap year");
		}                                                                                                                                        
		
	
	System.out.println("enter two nos.");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int n=a>b? a:b;
	int x=n;
	while(true)
	{
		if (n%a==0 && n%b==0)
		break;
		n=n+a;
	}
	System.out.println("Lcm of "+a+" and "+b+"="+n);
	

	
	n=a<b? a:b;
	while(true)
	{
		if (a%n==0 && b%n==0)
		break;
		n--;
	}
	System.out.println("hcf of "+a+" and "+b+"="+n);
	}
}


