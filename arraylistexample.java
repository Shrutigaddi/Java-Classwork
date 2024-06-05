package com.example;

import java.util.ArrayList;


public class arraylistexample {
	 
	public static void main(String[] args){
		
		
		
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("TCS");
		al1.add("CNS");
		al1.add("DBMS");
		
		System.out.println(al1);
		
		
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("BLOCKCHAIN");
		al2.add("ETHICAL HACKING");
		al2.add("WEB X");
		
		System.out.println(al2);
		al1.addAll(al2);
		System.out.println(al1);
		
		System.out.println(al2.get(2));
		
		al1.set(3, "CYBERSECURITY");
		System.out.println(al1);
		
	}

}