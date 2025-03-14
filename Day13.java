//Grade Calculator...!
/*
Problem: Write a program that takes a student's marks (0-100) and assigns a grade based on the following criteria:
90-100: A
80-89: B
70-79: C
60-69: D
Below 60: F
Hint: Use if-elif-else to check the marks range.*/


package com.javachallenges;

import java.util.Scanner;

public class Day13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z = new Scanner(System.in);
		System.out.print("Enter Your Grade: ");
		int a = z.nextInt();
		
		if(a>=90)
		{
			System.out.println("Your Grade is A!");
		}
		
		else if(a>=80 && a<90) 
		{
			System.out.println("Your Grade is B!");
		}
		
		else if(a>=70 && a<80)
		{
			System.out.println("Your Grade is C!");
		}
		
		else if(a>=60 && a<70)
		{
			System.out.println("Your Grade is D!");
		}
		
		else if(a >=59 && a<50)
		{
			System.out.println("Your Grade is E!");
		}
		
		else
		{
			System.out.println("Your Grade is F!");
		}

	}

}
