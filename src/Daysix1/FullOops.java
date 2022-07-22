package Daysix1;

interface Animal		//Interface
{
	public void legs();
	public void sound();
	public void eat();
}

abstract class Vegeterian implements Animal //inheritance
{
	@Override
	public  void legs()
	{
		System.out.println("four legs");
	}
	
	abstract public void sound();
	abstract public void eat();
	public static void movement() {
		System.out.println("Animal moves");
	}
}

class Monkey extends Vegeterian {
	@Override
	public  void sound() {
		System.out.println("Khi Khi");
	}
	@Override
	public void eat() {
		System.out.println("Monkey eats Banana");
	}
}

class Cow extends Vegeterian {
	public void sound() {
		System.out.println("Bow Bow");
	}
	public void eat() {
		System.out.println("Cow eats Grass");
	}
	public static void movement() {
		System.out.println("Animal runs");
	}
}
public class FullOops {

	public static void main(String[] args) {
		
		Vegeterian v=new Monkey();		//upcasting
		v.sound();				//late binding
		v.eat();
		v.legs();
		Vegeterian.movement();//early binding	
	}

}
