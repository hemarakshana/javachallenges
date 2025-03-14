//Calculate Tax Based on Income
/*Problem: Write a program that calculates tax based on income:

Below ₹2,50,000 → No tax
₹2,50,000 to ₹5,00,000 → 5% tax
₹5,00,000 to ₹10,00,000 → 20% tax
Above ₹10,00,000 → 30% tax
*/


package com.javachallenges;

import java.util.Scanner;

public class Day26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z = new Scanner(System.in);
		System.out.print("Enter your Annual Income:");
		double income = z.nextInt();
		double tax = 0;
		
		if(income<=250000)
		{
			System.out.println("No Tax! Enjoy...!");
		}
		
		else if(income>250000 && income<=500000)
		{
			tax = ((income-250000)*0.05);
		}
		else if(income>500000 && income<=1000000)
		{
			tax = (250000*0.05)+((income-500000)*0.20);
		}
		else
		{
			tax = (250000*0.05)+(500000*0.20)+((income-1000000)*0.30);
		}
		
		System.out.println("Your Calculated Tax is: Rs." +tax);
	}

}
