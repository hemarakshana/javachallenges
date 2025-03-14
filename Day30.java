//Water Bill Calculation
/*Problem: Compute the bill based on water consumption:

Up to 50L → ₹3 per liter
51 to 200L → ₹5 per liter
Above 200L → ₹10 per liter*/

package com.javachallenges;

import java.util.Scanner;

public class Day30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z = new Scanner(System.in);
		System.out.print("Enter a Liters of water consumed: ");
		int l = z.nextInt();
		int bill;
		
		if(l<=50)
		{
			bill = l*3;
		}
		else if(l>=51 && l<=200)
		{
			bill = l*5;
		}
		else
		{
			bill = l*10;
		}
		
		System.out.println("The Bill based on Water Consumption:Rs" +bill);

	}

}
