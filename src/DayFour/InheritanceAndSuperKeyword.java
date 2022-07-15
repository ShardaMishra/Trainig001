package DayFour;

class Human
{
	String name;
	Human(String n)
	{
		name=n;
	}
}

class Student extends Human
{
	String degree;
	
	Student(String n,String d)
	{
		super(n);
		degree=d;
	}
}

public class InheritanceAndSuperKeyword {

	public static void main(String[] args) {
		
		Student s1=new Student("Raju","Btech");
		System.out.println(s1.name);
		System.out.println(s1.degree);
		
		

	}

}
