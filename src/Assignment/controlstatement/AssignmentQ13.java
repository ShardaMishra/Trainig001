package com.josh.java.training.assignment.controlstatement;

class LinearSearch
{
	public static int search(int[] arr,int s)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==s) return i;

		}
		return -1;
	}

}
public class AssignmentQ13{

	public static void main(String[] args) {

		int [] arr= {5,7,3,8,1,2,9};
		System.out.println(LinearSearch.search(arr,2));
		System.out.println(LinearSearch.search(arr,4));	

	}
}

