package com.josh.java.training.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListClass {
	 public static void main(String[] args) {
	        // Creating a LinkedList
	        LinkedList<String> friends = new LinkedList<>();

	        // Adding new elements to the end of the LinkedList using add() method.
	        friends.add("Rajeev");
	        friends.add("ravi");
	        friends.add("Sahil");
	        friends.add("Karan");

	        System.out.println("Initial LinkedList : " + friends);

	        // Adding an element at the specified position in the LinkedList
	        friends.add(3, "Abhi");
	        System.out.println("After add : " + friends);

	        // Adding an element at the beginning of the LinkedList
	        friends.addFirst("Abhishek");
	        System.out.println("After addFirst) : " + friends);

	        // Adding an element at the end of the LinkedList (This method is equivalent to the add() method)
	        friends.addLast("smriti");
	        System.out.println("After addLast) : " + friends);

	    }

}
