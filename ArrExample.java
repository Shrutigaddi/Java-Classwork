package com.example;
import java.util.Scanner;

public class ArrExample {
	
     public static void main(String[] args) {
	        Scanner sc= new Scanner(System.in);
	        System.out.println("Enter the size of the array:");
	        int a = sc.nextInt();

	        int[] array = new int[a];
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < a; i++) {
	            array[i] = a.nextInt();
	        }

	        findSecondAndThirdLargest(array);
	    }

	    public static void findSecondAndThirdLargest(int[] array) {
	        int first, second, third;
	        first = second = third = Integer.MIN_VALUE;

	        for (int i = 0; i < array.length; i++) {
	            if (array[i] > first) {
	                third = second;
	                second = first;
	                first = array[i];
	            } else if (array[i] > second && array[i] != first) {
	                third = second;
	                second = array[i];
	            } else if (array[i] > third && array[i] != second && array[i] != first) {
	                third = array[i];
	            }
	        }

	        if (third == Integer.MIN_VALUE) {
	            System.out.println("There are less than 3 distinct elements in the array.");
	        } else {
	            System.out.println("The second largest element is: " + second);
	            System.out.println("The third largest element is: " + third);
	        }
	    }
	}
