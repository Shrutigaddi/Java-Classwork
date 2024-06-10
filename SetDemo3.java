package com.example;


import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Iterator;

public class SetDemo3 {
	
		public static void main (String [] args) {
			
			Set<String> emplist=new LinkedHashSet<String>();
			
			
			emplist.add("Shruti");
			emplist.add("Sanika");
			emplist.add("Sameeksha");
			emplist.add("Sarita");
			emplist.add("Anjali");
	        
	        System.out.println("The employee list is :" + emplist);        
	        
	        Iterator<String> iterator = emplist.iterator(); // Corrected here
	        
	        while (iterator.hasNext()) { // Corrected here
	            String name = iterator.next(); // Corrected here
	            System.out.println(name);
	        }
	    }
	}



