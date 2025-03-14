//Leap Year or Not...!
/*Problem: Write a program to check whether a given year is a leap year or not.
Hint: A year is a leap year if:

It is divisible by 4 AND
Not divisible by 100, unless it is also divisible by 400.*/


package com.javachallenges;

import java.util.Scanner;

public class Day12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z = new Scanner(System.in);
		System.out.print("Enter the Year: ");
		int year = z.nextInt();
		
		if(year%4==0 || year%100==0 || year%400==0)
		{
			System.out.println("The Given Year is Leap Year!");
		}
		
		else
		{
			System.out.println("The Given Year is Not Leap Year!");
		}

	}

}
