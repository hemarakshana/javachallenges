//Reversing a given String
package com.javachallenges;

import java.util.Scanner;

public class Day59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z  = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s = z.nextLine();
		
		String rev = "";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			rev = rev +s.charAt(i);
		}
		
		System.out.println("Reversed String: " +rev);

	}

}
