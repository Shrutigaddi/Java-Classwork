package com.example;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String args[])
	{
		int i,l,key,arr[];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the count of arrya:");
		l=sc.nextInt();
		arr=new int[l];
		
		System.out.println("enter "+ l + "element");
		for(i=0;i<l;i++)
		{
			arr[i]=sc.nextInt();
			}
		System.out.println("enter the serach key value:");
		key=sc.nextInt();
		for(i=0;i<l;i++)
		{
			if (arr[i]==key)
			{
				System.out.println(key +" is present at location"+(i+1));
			break;
		}
			if(i==l)
				System.out.println(key+"does not exist");
	}
	
}
}
