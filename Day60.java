//count of total number of occurrences of a given char. in a string without using loop
package com.javachallenges;

import java.util.Scanner;

public class Day60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z = new Scanner(System.in);
		
		System.out.print("Enter a String to find the Occrrences: ");
		String s = z.nextLine();
		
		System.out.print("Enter the Character to count: ");
		char target = z.next().charAt(0);
		
		int index = 0;
		int count = 0;
		
		while(true)
		{
			if(index == s.length())
			{
				break;
			}
			if(s.charAt(index) == target)
			{
				count++;
			}
			index++;
		}
		
		System.out.println("The Character '" +target+ "' appears " +count+ " times.");

	}

	
}
