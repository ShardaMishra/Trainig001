package DayThree;

import java.util.Scanner;

public class IfElseAndDoWhile {
	
	public static void main(String[] args) {
		
		int number=10;
		Scanner kb=new Scanner(System.in);
		char answer;
		do{
		System.out.println("Enter a number:");
		int userInput=kb.nextInt();
		
	        if(userInput>number) 
				System.out.println("Your No is greater than "+number);
			else 
				System.out.println("Your No is less than "+number);
		System.out.println("Want to continue(y/n)");
		answer=kb.next().charAt(0);
		}while(answer=='y');
		System.out.println("Thank you...");

	}

}
