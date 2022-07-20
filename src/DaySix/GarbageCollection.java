package DaySix;

class Student
{
	private int ID;
	private String name;
	private int age;
	private static int nextId=1;
	
	public Student(String name,int age)
	{
		this.name=name;
		this.age=age;
		this.ID=nextId++;
	}
	
	public void show()
	{
		System.out.println("Id=" +ID+ "\nName="+name+"\nAge="+age);
	}
	
	public void showNextId()
	{
	    System.out.println("Next student id will be "+nextId);
	}
	
	protected void finalize()
	{
		--nextId;
	}
}

public class GarbageCollection {

	public static void main(String[] args) {
		
		Student s=new Student("Bharat",53);
		Student s1=new Student("Subhra",50);
		Student s2=new Student("Gireesh",99);
		s.show();
		s1.show();
		s2.show();
		
		
		{
			
		  Student s3=new Student("Abhishek",25);
		  Student s4=new Student("Abhinav",24);
		  s3.show();
		  s4.show();
		  s3.showNextId();
		  s4.showNextId();
		
		  s3=s4=null;
		  System.gc();
		  System.runFinalization();
	    }
			
			
		
		
		s.showNextId();
	}

}
