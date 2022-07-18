package DayFour;

public class MethodOverloading {

	public static void main(String[] args) {
		
		m1();
		m1(10);
		m1(10,20);

	}
	
	static void m1()
	{
		System.out.println("m1()");
	}
	
	static void m1(int i)
	{
		System.out.println("m1(int)");
	}
	
	static void m1(int i,int j)
	{
		System.out.println("m1(int,int)");
	}

}
