package DayFour;

class Sim
{
	void ConnectCall()
	{
		System.out.println("call is connected");
	}
}

class Phone
{
	Sim s;
	
	Phone(Sim s)
	{
		this.s=s;
	}
	
	void Call(long num)
	{
		s.ConnectCall();
		System.out.println("call is connected to"+num);
	}
}



public class Composition {

	public static void main(String[] args) {
		
		Phone p=new Phone(new Sim());
		p.Call(98761233);
		
		

	}

}
