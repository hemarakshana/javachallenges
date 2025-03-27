//Sum Calculation
/*Problem: Find the Sum of First N Natural Numbers
Hint: Use a loop to add numbers from 1 to N OR use the formula Sum = N * (N + 1) / 2.
*/


package com.javachallenges;

import java.util.Scanner;

public class Day42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n = z.nextInt();
		int sum=0;
		
		for(int i=1; i<=n; i++)
		{
			sum += i; 
		}
		
		System.out.println("Sum using Loop: " +sum);
		
		//Method 2:
		int sumFormula = n*(n+1)/2;
		System.out.println("Sum using Formula: " +sumFormula);

	}

}
