//Printing only the numbers present in a String
package com.javachallenges;

import java.util.Scanner;

public class Day54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = z.nextLine();
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			
			if(ch >='0' && ch <='9')
			{
				System.out.println("The Numbers present in the String are: "+ch);
			}
		}
	}

}
