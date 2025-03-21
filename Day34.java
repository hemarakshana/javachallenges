//Ticket Pricing Based on Age & Time
/*Problem:

Children (Under 5) → Free
5-18 years → ₹100
18+ years → ₹200
After 9 PM → Extra ₹50*/

package com.javachallenges;

import java.util.Scanner;

public class Day34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z = new Scanner(System.in); 
		int  price;
		
		System.out.print("Enter your Age:");
		int age = z.nextInt();
		
		System.out.print("Enter Time(24-Hour format):");
		int time = z.nextInt();
		
		if(age<5)
		{
			price =0;
		}
		else if(age<=18)
		{
			price = 100;
		}
		else
		{
			price = 200;
		}
		
		if(time >=21)
		{
			price+=50;
		}
		
		System.out.println("Total Ticket Price: Rs." +price);
	}

}
