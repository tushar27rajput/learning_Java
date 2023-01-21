package testJava;

import java.util.Scanner;

public class BinarySearch 
{

	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
	        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	        System.out.print("Enter a number to search: ");
	        int num = sc.nextInt();
	        int left = 0;
	        int right = arr.length - 1;
	        int mid;
	        boolean found = false;
	        while (left <= right) 
	        {
	            mid = (left + right) / 2;
	            if (arr[mid] == num) 
	            {
	                System.out.println(num + " is found at index " + mid);
	                found = true;
	                break;
	            } else if (arr[mid] < num) 
	            {
	                left = mid + 1;
	            } else 
	            {
	                right = mid - 1;
	            }
	        }
	        if (!found) 
	        {
	            System.out.println(num + " is not found in the array.");
	        }

	}

}

/**
 * This is an example of a binary search algorithm implemented in Java. 
 * The program takes in an array of integers and prompts the user to enter a number to search for. 
 * The search begins by comparing the middle element of the array with the search key. 
 * If the search key is equal to the middle element, the position of the middle element is returned. 
 * If the search key is less than the middle element, the search continues in the left half of the array. 
 * If the search key is greater than the middle element, the search continues in the right half of the array. 
 * The process continues until the search key is found or the search reaches an empty portion of the array.
*/