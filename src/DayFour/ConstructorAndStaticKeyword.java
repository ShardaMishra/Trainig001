package DayFour;

class Rectangle
{
	int length;
	int breadth;
	static int count;
	
Rectangle(int l,int b)
{
	length=l;
	breadth=b;
	count++;
	
}
}

public class ConstructorAndStaticKeyword {

	public static void main(String[] args) {
		
		Rectangle r1=new Rectangle(2,4);
		Rectangle r2=new Rectangle(5,8);
		System.out.println("count= "+Rectangle.count);
		
		

	}

}
