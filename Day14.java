//Check Divisibility...!
/*Problem: Write a program that checks if a number is divisible by both 3 and 5.
Hint: Use if number % 3 == 0 and number % 5 == 0.

*/

package com.javachallenges;

import java.util.Scanner;

public class Day14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z = new Scanner(System.in);
		System.out.print("Enter a Nummber to Check the Divisibility: ");
		int n = z.nextInt();
		
		if(n%3==0 && n%5==0)
		{
			System.out.println("Divisible by both 3 and 5");
		}
		
		else if(n%3==0)
		{
			System.out.println("Divisible by 3");
		}
		
		else if(n%5==0)
		{
			System.out.println("Divisible by 5");
		}
		
		else
		{
			System.out.println("The Number is Not Divisible by 3 or 5");
		}

	}

}
