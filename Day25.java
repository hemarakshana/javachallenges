//Roots of a Quadratic Equation...!
/*Problem: Given coefficients a, b, c, find the roots using:

Discriminant (D) = b² - 4ac
If D > 0, two real roots
If D = 0, one real root
If D < 0, complex roots
*/


package com.javachallenges;

import java.util.Scanner;

public class Day25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z = new Scanner(System.in);
		System.out.print("Enter the Coefficients:");
		int a = z.nextInt();
		int b = z.nextInt();
		int c = z.nextInt();
		
		int D=((b*b)-(4*a*c));
		
		if(D>0)
		{
			System.out.println("Two Real Roots " +D);
		}
		else if(D<0)
		{
			System.out.println("Complex Roots " +D);
		}
		else
		{
			System.out.println("One Real Root " +D);
		}
	}

}
