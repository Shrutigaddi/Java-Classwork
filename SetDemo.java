package com.example;


import java.util.Set;
import java.util.HashSet;

public class SetDemo {
	
	public static void main (String args[]) {
		
		Set<Integer>  set1 = new HashSet<>();
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		System.out.println("Set1:"  +set1);
		
		Set<Integer>  set2 = new HashSet<>();
		set2.add(5);
		set2.add(6);
		set2.add(7);
		set2.add(8);
		System.out.println("Set1:"  +set2);
		
		
		
		set2.addAll(set1);
		System.out.println("Union is :"+set2);
		
		
	}

}
