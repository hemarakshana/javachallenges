//Time-based Greeting System
/*Problem: Print a greeting based on the time (24-hour format):

0 - 12 hrs → "Good Morning"
12 - 18 hrs → "Good Afternoon"
18 - 24 hrs → "Good Evening"
*/


package com.javachallenges;

import java.util.Scanner;

public class Day32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z = new Scanner(System.in);
		System.out.println("Enter the Time");
		int time = z.nextInt();
		
		if(time>=0 && time<=12)
		{
			System.out.println("Good Morning!");
		}
		else if(time>=12 && time<=18)
		{
			System.out.println("Good Afternoon!");
		}
		else if(time>=18 && time<=24)
		{
			System.out.println("Good Evening!");
		}
		else
		{
			System.out.println("Entered time is Invalid...! Enter the correct Time..");
		}
			
	}

}
