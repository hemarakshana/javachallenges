//Electricity Bill Calculation...!
/*Problem: Write a program that calculates the electricity bill based on units consumed:

Up to 100 units: ₹5 per unit
101-200 units: ₹7 per unit
201-300 units: ₹10 per unit
Above 300 units: ₹15 per unit
Hint: Use if-else if conditions to check units and calculate the total bill.*/


package com.javachallenges;

import java.util.Scanner;

public class Day20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z = new Scanner(System.in);
		System.out.print("Enter your units:");
		int unit=z.nextInt();
		int total;
		
		if(unit<=100)
		{
			total = unit*5;
		}
		else if(unit>=101 && unit<=200)
		{
			total = unit*7;
		}
		else if(unit>=201 && unit<=300)
		{
			total = unit*10;
		}
		else
		{
			total = unit*15;
		}
		
		System.out.println("The Total Bill is: Rs." +total);

	}

}
