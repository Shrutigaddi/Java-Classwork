package com.example;
import java.util.HashMap;
import java.util.Map;
import java.util.Set; // Import the Set interface

public class MapDemo1 {
	
			public static void main(String[] args) {
				
				Map<String, String> map = new HashMap<String, String>();
				
				map.put("shruti", "student");
				map.put("sonam", "CA");
				map.put("Aman", "IAS");
				map.put("varad", "IPS");
				
				System.out.println(map.get("DOCTOR")); // This line will print null because "DOCTOR" key is not present
				
				Set<String> position = map.keySet();
				
				for(String key : position) {
					System.out.println(map.get(key));			
				}
				
				for(String key : position) {
					System.out.println(key + " " + map.get(key));
				}
			}
		}


