//Calculate the sum..!
/*Write a Java program to calculate the sum of all elements in an integer array using two different approaches:
	1.Using a for loop.
	2.Using a for-each loop.
*/

package com.javachallenges;

public class Day48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] marks = {96, 78, 85, 36, 63}; 
	     int sum = 0;   
	     int sum1=0;
	       
	     //1. Using 
	     for (int i = 0; i < marks.length; i++) 
	     {
	    	 sum = sum +marks[i];
	            
	     }
	     System.out.println("Sum of the array: " + sum);
			
	     System.out.println(".........ForEach........");
	     for(int mark:marks) 
	     {
	        sum1 += mark;
	     }
	     System.out.println("Sum of the array: " + sum1);

	}

}
