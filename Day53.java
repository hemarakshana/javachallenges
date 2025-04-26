//Count of one character in a given String
package com.javachallenges;

import java.util.Scanner;

public class Day53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s = z.nextLine();
		
		char target = z.next().charAt(0);
		
		int count = 0;
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)==target)
			{
				count++;
			}
		}
		System.out.println("Character " +target+ " Comes " +count );
		
	}

}
