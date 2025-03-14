//Check Eligibility to Vote
/*Problem: Write a program that asks for a person's age and checks if they are eligible to vote (18 years or older).
Hint: Use if-else.*/


package com.javachallenges;

import java.util.Scanner;

public class Day23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z = new Scanner(System.in);
		System.out.print("Enter your Age:");
		int age = z.nextInt();
		
		if(age>=18)
		{
			System.out.println("You are Eligible to Vote");
		}
		else
		{
			System.out.println("OOPS!... You are Not Eligible to Vote");
		}
	}

}
