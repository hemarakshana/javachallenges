//Check Triangle Type...!
/*Problem: Write a program that takes three sides of a triangle and determines if it is:

Equilateral (all sides equal)
Isosceles (two sides equal)
Scalene (all sides different)
Hint: Use if-else conditions to compare sides.*/


package com.javachallenges;

import java.util.Scanner;

public class Day18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z = new Scanner(System.in);
		System.out.print("Enter a sides of Triangle:");
		int a = z.nextInt();
		int b = z.nextInt();
		int c = z.nextInt();
		
		if(a==b && b==c && c==a)
		{
			System.out.println("Equilateral Triangle");
		}
		else if(a==b || b==c || a==c)
		{
			System.out.println("Isosceles Triangle");
		}
		else
		{
			System.out.println("Scalene Triangle");
		}

	}

}
