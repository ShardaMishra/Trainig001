package DaySix;

class Circle
{
	private int radius;
	
	public void setradius(int r) 
	{
	   radius=r;
	}
	
	public int getradius()
	{
		return radius;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		
		Circle c=new Circle();
		c.setradius(10);
		int r=c.getradius();
		
		System.out.println(r);
		
		
	}
}


