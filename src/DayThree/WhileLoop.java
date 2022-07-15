package DayThree;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		int num=sc.nextInt();
		int reverse=0;
		
		while(num!=0)
		{
			int reminder=num%10;
			reverse=reverse*10+reminder;
			num=num/10;
		}

		System.out.println("The reverse of the number is:"+reverse);
		

	}

}
