// Pattern Printing - Square Pattern
/*
Problem: Print a Square of Size N × N
Hint: Use nested loops to print * in rows and columns.
***
***
***

*/
package com.javachallenges;

import java.util.Scanner;

public class Day45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z = new Scanner(System.in);
		int n = z.nextInt();
		
		for(int i =0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}

	}

}
