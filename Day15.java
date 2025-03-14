//Simple Calculator
/*Problem: Take two numbers and an operator (+, -, *, /) as input, then perform the corresponding operation and display the result.
Hint: Use if-elif-else to check the operator and perform the operation.*/


package com.javachallenges;

import java.util.Scanner;

public class Day15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z = new Scanner(System.in);
		System.out.print("Enter a number x: ");
		int x = z.nextInt();
		System.out.print("Enter a number y: ");
		int y = z.nextInt();
		System.out.print("Enter a Operator: ");
		char op = z.next().charAt(0);
		
		if(op=='+')
		{
			System.out.println("Sum of Two Numbers: " +(x+y));
		}
		
		else if(op=='-')
		{
			System.out.println("Sub of Two Numbers: " +(x-y));
		}
		
		else if(op=='*')
		{
			System.out.println("Multiple of Two Numbers: " +(x*y));
		}
		
		else if(op=='/')
		{
			if(y!=0)
			{
				System.out.println("Divisble of Two Numbers: " +(x/y));
			}
			else
			{
			System.out.println("Error: Division by zero is not allowed!");
			}
		}
		
		else if(op=='%')
		{
			if(y!=0)
			{
				System.out.println("Modulus of Two Numbers: " +(x/y));
			}
			else
			{
				System.out.println("Error: Modulus by zero is not allowed!");
			}
		}
		
		else
		{
			System.out.println("Invalid Operator!");
		}
		
	}

}
