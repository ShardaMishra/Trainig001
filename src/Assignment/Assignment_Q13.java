package Assignment;

class LinearSearch
{
	public static int Search(int[] a,int s)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==s) return i;
			
		}
		return -1;
	}


public class Assignment_Q13{

	public static void main(String[] args) {
		
		int [] a= {5,7,3,8,1,2,9};
		System.out.println(Search(a,2));
		System.out.println(Search(a,4));	

	}
}
}

