package com.example;

import java.util.TreeMap;
import java.util.Map;

public class MapEx3 {
	
	public static void main(String[] args) {
		
		Map<String,Integer> treeMap = new TreeMap<>();
		
		//adding the elements 
		treeMap.put("Shruti",4);
		treeMap.put("Shree",1);
		treeMap.put("vaishu",3);
		treeMap.put("ashni",2);
		 System.out.println(treeMap);
		
		//getting values 
		int valueshruti = treeMap.get("Shruti");
		System.out.println("Value of Shruti: " + valueshruti);
		
		//removing element
		treeMap.remove("vaishu");
		
		//iterating the element 
		for (String key : treeMap.keySet()) {
			System.out.println("Key:" + key +", Value:"  +treeMap.get(key));
		}
		
	}

}


