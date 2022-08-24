package com.prctice.java;
import java.util.*;

public class Assi1{ 

	   public static void main(String[] args) {
	    
	    AbstractList<Integer> num = new ArrayList<Integer>();
	      num.add(1);
	      num.add(4);
	      num.add(8);
	      num.add(10);
	      num.add(19);
	      num.add(20);
	   int length=0;
	   Integer sum = 0;
	   for (int i = 0; i < num.size(); i++) {
	       length++;
	       sum = sum+num.get(i);
	    
	   }
	   
	   for(int j=0; j<num.size(); j++) {
	       if (num.get(j) % 2 == 0) {
	         num.remove(j);
	      }
	   }
	    System.out.println("Sum of values "+sum);
	    System.out.println("length of List "+length);
	    
	    System.out.println("odd elements in list"+num);
	    
	 
	}
	}

