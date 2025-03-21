//Banking Loan Eligibility System
/*Problem:
Write a program that takes the applicant’s age, salary, and credit score to determine if they are eligible for a loan:

Condition	Eligibility
Age < 21	Not eligible
Salary < ₹20,000	Not eligible
Credit Score < 650	Not eligible
Otherwise	Eligible
Hint: Use multiple if-else conditions.
*/


package com.javachallenges;

import java.util.Scanner;

public class Day39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z = new Scanner(System.in);
		System.out.print("Enter Your Age: ");
		int age = z.nextInt();
		System.out.print("Enter Your Salary: ");
		int salary = z.nextInt();
		System.out.print("Enter Your Credit Score: ");
		int creditScore = z.nextInt();
		
		if(age<21 && salary<20000 && creditScore<650)
		{
			System.out.println("Your Not Eligible for Loan");
		}
		else
		{
			System.out.println("Your Eligible for Loan");
		}

	}

}
