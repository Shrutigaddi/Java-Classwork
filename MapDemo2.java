package com.example;

import java.util.Map;
import java.util.HashMap;

public class MapDemo2 {
	
	public static void main(String[] args) {
		//creating a map
		Map<String,Integer>emp=new HashMap<String,Integer>();
		//insert element
		emp.put("shruti",1234);
		emp.put("shree",1234);
		emp.put("shrushti",5234);
		emp.put("shrutika",1239);
		emp.put("shamal",9834);
		
		//accessing 
		System.out.println("Map:" + emp);
		
		//accessing key
		System.out.println("keys:" + emp.keySet());
		
		//accessing values
		System.out.println("Values:"+ emp.values());
		
		//accessing the entries
		System.out.println("Entries:" + emp.entrySet());
		
        //removing 
		int value = emp.remove("shruti");
		System.out.println("Removed value is:" + value);}

}

