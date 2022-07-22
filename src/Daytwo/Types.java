package Daytwo;
import java.util.Scanner;

public class Types {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter year");
		int y=sc.nextInt();
		if(y%400==0){
			System.out.println("Leap year");
		}
		else if(y%4==0 && y%100!=0){
			System.out.println("Leap year");
		}
		else{
			System.out.println("not a Leap year");
		}                                                                                                                                        
		
		System.out.println("enter two nos.");
		int FirstNum=sc.nextInt();
		int SecondNum=sc.nextInt();
		int n=FirstNum>SecondNum? FirstNum:SecondNum;
		int x=n;
		while(true){
			if (n%FirstNum==0 && n%SecondNum==0) break;
			n=n+FirstNum;
		}
		System.out.println("Lcm of "+FirstNum+" and "+SecondNum+"="+n);
	
		n=FirstNum<SecondNum? FirstNum:SecondNum;
		while(true){
			if (FirstNum%n==0 && SecondNum%n==0) break;
			n--;
		}
		System.out.println("hcf of "+FirstNum+" and "+SecondNum+"="+n);
	}
}
