//Check Even or Odd
/*Problem: Write a program that takes an integer as input and checks whether it is even or odd.
Hint: Use the modulus operator % to check divisibility by 2.
*/


package com.javachallenges;

import java.util.Scanner;

public class Day8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z = new Scanner(System.in);
		System.out.print("Enter a Number:");
		int a = z.nextInt();
		
		if(a%2==0)
		{
			System.out.println("The given Number is Even!");
		}
		else 
		{
		System.out.println("The given Number is Odd!");
			
		}
	}

}
