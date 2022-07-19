package DayFive;

class Vegetable
{
	public void color()
	{
		System.out.println("vegetable have color");
	}
	
	public void taste()
	{
		System.out.println("vegetable have taste");
	}
}

class Carrot extends Vegetable
{
	@Override
	public void color()
	{
		System.out.println("red");
	}
	
	@Override
	public void taste()
	{
		System.out.println("sweet");
	}
}

public class RunTimePolymorphism {

	public static void main(String[] args) {

		
		Vegetable v=new Carrot();
		v.color();
		v.taste();
	
		

	}

}
