//Student Scholarship Eligibility
/*Problem: Determine if a student gets a scholarship:

Above 90% → Full Scholarship
80% - 90% → 50% Scholarship
Below 80% → No Scholarship*/

package com.javachallenges;

import java.util.Scanner;

public class Day36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z = new Scanner(System.in);
		
		System.out.print("Enter your percentage: ");
		double percentage = z.nextDouble();
		
		if(percentage>90)
		{
			System.out.println("Full Scholarship");
		}
		else if(percentage>=80 && percentage<=90)
		{
			System.out.println("50% Scholarship");
		}
		else
		{
			System.out.println("No Scholarship");
		}

	}

}
