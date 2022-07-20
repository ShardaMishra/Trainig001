package DaySix;

class Employee
{
	final void id()
	{
		System.out.println("The id of employee is 435");
	}
}

class Rakesh extends Employee
{
	final  void id()//can't override 
	// compile-time error
	{
		System.out.println("The id of rakesh is 234");
	}
}

public class Final {

	public static void main(String[] args) {
		
		Employee e=new Rakesh();
		e.id();
	}

}
