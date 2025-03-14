//Traffic Light Simulation...!
/*Problem: Write a program that takes an input ("Red", "Yellow", or "Green") and prints the corresponding action:

"Red" → Stop
"Yellow" → Get Ready
"Green" → Go
Hint: Use if-else if-else.*/


package com.javachallenges;

import java.util.Scanner;

public class Day22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z  = new Scanner(System.in);
		System.out.print("Enter the color:");
		String color = z.nextLine();
		
		if(color.equals("red"))
		{
			System.out.println("STOP🛑");
		}
		
		else if(color.equals("yellow"))
		{
			System.out.println("GET READY!⚠️");
		}
		else if(color.equals("green"))
		{
			System.out.println("GO...!✅");
		}
		else
		{
			System.out.println("Invalid Input.");
		}

	}

}
