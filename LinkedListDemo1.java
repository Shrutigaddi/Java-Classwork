package com.example;
import java.util.Iterator;
import java.util.LinkedList;


public class LinkedListDemo1 {
		      
		      
		public static void main(String args[])
		{
			LinkedList<String> l1 = new LinkedList<String>();
			System.out.println("Initial size:" + l1.size());
			
			// Adding elements
			l1.add("pune");
			l1.add("mumbai");
			l1.add("noida");
			System.out.println("Element list is: " + l1);
			System.out.println("Size of list after adding elements: " + l1.size());
			
			// Removing element at index 1
			l1.remove(1);
			System.out.println("Element list after deletion: " + l1);
			System.out.println("Size of list after deletion: " + l1.size());
			
			// Removing first and last element from the list
			if (!l1.isEmpty()) {
				l1.removeFirst();
			}
			if (!l1.isEmpty()) {
				l1.removeLast();
			}
			System.out.println("l1 after deleting last and first: " + l1);
			System.out.println("Size of list is: " + l1.size());
			
			// Checking if list is not empty before retrieving elements
			if (!l1.isEmpty()) {
				System.out.println("First element of l1 is: " + l1.getFirst());
				System.out.println("Last element of l1 is: " + l1.getLast());
			} else {
				System.out.println("List is empty, no first and last elements to retrieve.");
			}
			
			// Using iterator
			Iterator<String> itr = l1.iterator();
			while (itr.hasNext()) {
				System.out.print(itr.next());
				if (itr.hasNext()) {
					System.out.print(", ");
				}
			}
			System.out.println(); // To ensure the console output ends with a new line
		}
	}
