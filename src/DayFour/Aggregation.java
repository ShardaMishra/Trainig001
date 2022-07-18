package DayFour;

class car
{
	int num;
	private static int n=1000;
	
	car(){
		
		num=n++;
		
	}
	
	void start() {
		
		System.out.println(num+"car engine starts");
	}
	
	void accelerate() {
		
		System.out.println(num+"car accelerated");
	}
	
	void stop() {
		System.out.println(num+"car stopped");
	}
}

class Driver
{
	car c;
	
	Driver(car c)
	{
		this.c=c;
	}
	
	void Drive() {
		
		c.start();
		c.accelerate();
		c.stop();
	}
}

public class Aggregation {

	public static void main(String[] args) {
		
		Driver d1=new Driver(new car());
		Driver d2=new Driver(new car());
		d1.Drive();
		System.out.println("_____");
		
		d2.Drive();
		System.out.println("_____");
		
	
	

	}

}
