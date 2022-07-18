package DayFour;

class Rectangle1
{
	int length;
	int breadth;
	
	public Rectangle1(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	
	public Rectangle1(int length,Rectangle1 r)
	{
		this.length=length;
		this.breadth=r.breadth;
	}
	public Rectangle1(Rectangle1 x,Rectangle1 y)
	{
		this.length=x.length;
		this.breadth=y.breadth;
	}
	public void area()
	{
		System.out.println(length*breadth);
	}
}

public class CopyconstructorAndConstructorOverloading {

	public static void main(String[] args) {
		
		Rectangle1 r1=new Rectangle1(10,4);
		Rectangle1 r2=new Rectangle1(6,2);
		Rectangle1 r3=new Rectangle1(5,r2);
		Rectangle1 r4=new Rectangle1(r2,r1);
		
		r1.area();
		r2.area();
		r3.area();
		r4.area();

	}

}
