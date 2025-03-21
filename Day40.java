//Vehicle Speed Fine System
/*Problem:
Write a Java program that calculates the fine for overspeeding based on speed:

Speed (km/h)	Fine (₹)
Up to 60 km/h	No Fine
61 - 80 km/h	₹500
81 - 100 km/h	₹1000
Above 100 km/h	₹5000
Hint: Use if-else if statements.
*/


package com.javachallenges;

import java.util.Scanner;

public class Day40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z = new Scanner(System.in);
		System.out.print("Enter the Speed: ");
		int speed = z.nextInt();
		
		if(speed>100)
		{
			System.out.println("Your Fine for Overspeeding Rs.5000");
		}
		else if(speed>=61 && speed<=80)
		{
			System.out.println("Your Fine for Overspeeding Rs.500");
		}
		else if(speed>=81 && speed<=100)
		{
			System.out.println("Your Fine for Overspeeding Rs.1000");
		}
		else 
		{
			System.out.println("No Fine");
		}

	}

}
