//Check Vowel or Consonant...!
/*Problem: Write a program that takes a character as input and checks whether it is a vowel (a, e, i, o, u) or a consonant.
Hint: Use if-else conditions with char data type.*/

package com.javachallenges;

import java.util.Scanner;

public class Day17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z = new Scanner(System.in);
		System.out.print("Enter the Character:");
		char ch = z.next().toLowerCase().charAt(0);
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			System.out.println(ch+ " is a Vowel.");
		}
		else if((ch>='a') && (ch<='z'))
		{
			System.out.println(ch+ " is a Consonant.");
		}
		else
		{
			System.out.println("Invalid input!");
		}
	}

}
