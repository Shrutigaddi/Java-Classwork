package com.example;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;



public class SetDemo1 {
	public static void main (String [] args) {
		
		Set<String> emplist=new HashSet<String>();
		
		
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
