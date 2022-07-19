package DayFive;

class Animal
{
	public void eat()
	{
		System.out.println("Animal eats");
	}
	
	public void move()
	{
		System.out.println("Animal runs");
	}
	
	public void sound()
	{
		System.out.println("Animal sounds");
	}
}

class Dog extends Animal
{
	@Override
	public void eat()
	{
		System.out.println("Non-veg");
	}
	
	@Override
	public void move()
	{
		System.out.println("Runs");
	}
	
	@Override
	public void sound()
	{
		System.out.println("Barks");
	}
}

public class MethodOverridding {

	public static void main(String[] args) {
		
		Animal a=new Dog();
		
		a.eat();
		a.move();
		a.sound();



	}

}
