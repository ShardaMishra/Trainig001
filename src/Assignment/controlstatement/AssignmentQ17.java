package com.josh.java.training.assignment.controlstatement;


class QuickSort
{
	public static void quickSort(int[] inputArray,int start,int end)
	{
		if(start>=end) return;
		int pivot=inputArray[(start+end)/2];
		int i=start;
		int j=end;
		while(i<=j)
		{
			while(inputArray[i]<pivot) i++;
			while(inputArray[j]>pivot) j--;

			int temp=inputArray[i];
			inputArray[i]=inputArray[j];
			inputArray[j]=temp;
			i++;
			j--;

		}

		quickSort(inputArray,start,j);
		quickSort(inputArray,i,end);
	}


public class AssignmentQ17 {
	public static void main(String[] args) {

		int[] inputArray= {5,3,8,9,1,2};
		quickSort(inputArray,0,inputArray.length-1);
		for(int n:inputArray) System.out.println(n);
	}
	}

}
