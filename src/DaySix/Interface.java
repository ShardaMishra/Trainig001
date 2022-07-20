package DaySix;

interface phone
{
	public abstract void call();
}

interface camera
{
	 void capture();
}

class Iphone implements phone,camera
{
	public void call()
	{
		System.out.println("call connected");
	}
	
	public void capture()
	{
		System.out.println("captured");
	}
}


public class Interface {

	public static void main(String[] args) {
		
		camera c=new Iphone();
		c.capture();
		phone p=new Iphone();
		p.call();
		

	}

}
