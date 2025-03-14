// Check Positive, Negative, or Zero
/*
Problem: Write a program that takes a number as input and determines whether it is positive, negative, or zero.
Hint: Use if conditions to check for each case.
*/

package com.javachallenges;

import java.util.Scanner;

public class Day11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z = new Scanner(System.in);
		System.out.print("Enter a Number to Check: ");
		int n = z.nextInt();
		
		if(n>0)
		{
			System.out.println("The given number is Positive!");
		}
		
		if(n<0)
		{
			System.out.println("The given number is Negative!");
		}
		if(n==0)
		{
			System.out.println("The given number is Zero!");
		}
		
	}

}
