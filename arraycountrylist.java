package com.example;


import java.util.ArrayList;
import java.util.Scanner;

public class arraycountrylist {

	    public static void main (String[] args) {
	    
	    	Scanner sc=new Scanner(System.in);
	    	int count;
	    	System.out.println("Enter The count of country:");
	    	count=sc.nextInt();
	    	
	    	ArrayList<String>  country= new ArrayList<String>();
	    	System.out.println("Enter the name");
	    	sc.nextLine();
	    	
	    	
	    	for(int i=0;i<=count;i++)
	    	{	   
	    		    	
	    	   System.out.println("Country Names are "+i);
	    	   String UserCountry=sc.nextLine();
	    	   country.add(UserCountry);
	    	   
	    	}
	    	   System.out.println(country);    
	    	
	}
}