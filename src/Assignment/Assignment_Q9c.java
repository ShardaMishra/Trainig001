package Assignment;

public class Assignment_Q9c {

	public static void main(String[] args) {
	
		int num=8;
		for(int a=1;a<=8;a++)
		{
			for(int b=1;b<=8;b++)
			{
				if(b>=a)
				{
					System.out.print("#");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}

	}

}
