//Age-based Movie Ticket Price...!
/*Problem: Write a program where the ticket price is based on age:

Below 5 years: Free
5 to 12 years: ₹50
13 to 18 years: ₹100
Above 18: ₹150
Hint: Use if-else if-else conditions.*/

package com.javachallenges;

import java.util.Scanner;

public class Day19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z = new Scanner(System.in);
		System.out.print("Enter Your Age: ");
		int age = z.nextInt();
		
		if(age<5)
		{
			System.out.println("Ticket is Free!");
		}
		else if(age>=5 && age<=12)
		{
			System.out.println("Ticket Price is Rs.50");
		}
		else if(age>=13 && age<=18)
		{
			System.out.println("Ticket Price is Rs.100");
		}
		else
		{
			System.out.println("Ticket Price Rs.150(Above 18Years)");
		}
	}

}
