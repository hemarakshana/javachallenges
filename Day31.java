// Railway Ticket Fare Calculation
/*Problem: Compute railway fare:

General Class: ₹1.5 per km
Sleeper Class: ₹2.5 per km
AC Class: ₹5 per km*/

package com.javachallenges;

import java.util.Scanner;

public class Day31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z = new Scanner(System.in);
		System.out.println("Enter the Km you travelled:");
		double km = z.nextDouble();
		double fare;
		
		System.out.println("Enter your Class if: Enter 0 if AC Class Enter 1 if Sleeper Class Enter 2 if General Class");
		int n = z.nextInt();
		
		if(n==0)
		{
			fare = km * 5; 
		}
		else if(n==1)
		{
			fare = km * 2.5;
		}
		else
		{
			fare = km * 1.5;
		}
		
		System.out.println("The Calculated Railway Ticket Fare: Rs." +fare);
	}

}
