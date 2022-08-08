package com.josh.java.training.collection.queue;

import java.util.PriorityQueue;

public class PriortityQueueClass {
	public static void main(String[] args) {
		PriorityQueue<String> namePriorityQueue = new PriorityQueue<>();

		// Add items to a Priority Queue (ENQUEUE)
		namePriorityQueue.add("Lisa");
		namePriorityQueue.add("Robert");
		namePriorityQueue.add("John");
		namePriorityQueue.add("Chris");
		namePriorityQueue.add("Angelina");
		namePriorityQueue.add("Joe");

		// Remove items from the Priority Queue (DEQUEUE)
		while (!namePriorityQueue.isEmpty()) {
			System.out.println(namePriorityQueue.remove());
		}
	}
}
