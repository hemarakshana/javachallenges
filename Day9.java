//Largest Number...!
/*Problem: Write a program that takes three numbers as input and prints the largest number.
Hint: Use if-elif-else conditions to compare the numbers.*/

package com.javachallenges;

import java.util.Scanner;

public class Day9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z = new Scanner(System.in);
		System.out.print("Enter a First number: ");
		int a = z.nextInt();
		
		System.out.print("Enter a Second number: ");
		int b = z.nextInt();
		
		System.out.print("Enter a Third number: ");
		int c = z.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("Largest Number is: " +a);
		}
		else if(b>c)
		{
			System.out.println("Largest Number is: " +b);
		}
		else
		{
			System.out.println("Largest Number is: " +c);
		}
	}

}
