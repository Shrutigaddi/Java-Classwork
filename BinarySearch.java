package com.example;
import java.util.Scanner;

public class BinarySearch {
	
	        public static int binarySearch(int[] arr, int key) {
	        int low = 0;
	        int high = arr.length - 1;

	        while (low <= high) {
	            int mid = (low + high) / 2;

	            if (arr[mid] == key) {
	                return mid;
	            } else if (arr[mid] < key) {
	                low = mid + 1;
	            } else {
	                high = mid - 1;
	            }
	        }

	        return -1; // Element not found
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();

	        int[] arr = new int[size];

	        System.out.println("Enter the elements of the array in sorted order:");
	        for (int i = 0; i < size; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        System.out.print("Enter the element to search: ");
	        int key = scanner.nextInt();

	        int result = binarySearch(arr, key);

	        if (result != -1) {
	            System.out.println("Element found at index: " + result);
	        } else {
	            System.out.println("Element not found in the array.");
	        }

	        scanner.close();
	    }
	}
