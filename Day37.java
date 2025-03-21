//Validate Triangle Formation
/*Problem: Given three sides, check if they can form a valid triangle:

Triangle Rule: Sum of any two sides must be greater than the third side*/

package com.javachallenges;

import java.util.Scanner;

public class Day37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z = new Scanner(System.in);
		System.out.print("Enter the sides of Triangle: ");
		
		int a = z.nextInt();
		int b = z.nextInt();
		int c = z.nextInt();

		if(a+b>c && b+c>a && c+a>b)
		{
			System.out.println("The sides can form a valid triangle.");
		}
		else
		{
			System.out.println("OOPS..They can't form valid triangle.");
		}
	}

}
