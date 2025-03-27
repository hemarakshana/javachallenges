//Factorial Calculation
/*
Problem: Find Factorial of a Number
Hint: Multiply numbers from 1 to N using a loop.
*/

package com.javachallenges;

import java.util.Scanner;

public class Day44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z = new Scanner(System.in);
		System.out.print("Enter a number to find factorial: ");
		int n = z.nextInt();
		
		int fact = 1;
		for(int i=1; i<=n; i++)
		{
			fact *= i;
		}
		
		System.out.println("Factorial of " +n+ " is: " +fact);
		
	}

}
