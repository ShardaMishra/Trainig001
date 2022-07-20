package DaySix;

abstract class car
{
	public abstract void start();
	public abstract void accelerate();
	abstract public void stop();
	
	public void musicplayer()
	{
		System.out.println("car has music player");
	}
}

class Audi extends car
{
	public void start()
	{
		System.out.println("starts");
	}
	
	public void accelerate()
	{
		System.out.println("accelerate");
	}
	
	public void stop()
	{
		System.out.println("stopped");
	}
}

class Nano extends car
{
	 public void start()
	 {
	    System.out.println("starts");	 
	 }
	 
	 public void accelerate()
	 {
		 System.out.println("accelerate");
	 }
	 
	 public void stop()
	 {
		 System.out.println("stopped");
	 }
	 
	 public void musicplayer()
	 {
		 System.out.println("song");
	 }
}

public class Abstract {

	public static void main(String[] args) {
		
		car c=new Audi();
		c.start();
		c.accelerate();
		c.stop();
		
	}

}
