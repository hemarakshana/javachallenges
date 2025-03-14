//Convert Temperature (Celsius to Fahrenheit & Vice Versa)
/*Problem: Ask the user whether they want to convert:

Celsius to Fahrenheit: F = (C × 9/5) + 32
Fahrenheit to Celsius: C = (F - 32) × 5/9*/


package com.javachallenges;

import java.util.Scanner;

public class Day29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z = new Scanner(System.in);
		System.out.println("If you want to Celsius to Fahrenheit the enter 1. ");
		int n = z.nextInt();
		
		if(n==1)
		{
			System.out.println("Enter the Celsius:");
			double C = z.nextDouble();
			double F = (C*1.8)+32; 
			System.out.println("Celsius to Fahrenheit: " +F);
		}
		
		else 
		{
			System.out.println("Enter the Fahrenheit:");
			double F = z.nextDouble();
			double C = (F-32)*1.8; 
			System.out.println("Fahrenheit to Celsius: " +C);
		}
	}

}
