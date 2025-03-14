//Validate Password Strength
/*Problem: Write a program that checks if a user’s password meets these conditions:

At least 8 characters long
Contains both uppercase and lowercase letters
Contains at least one number
Contains at least one special character (@, #, $, etc.)
Hint: Use if-else with Character.isUpperCase(), Character.isDigit(), etc.
*/


package com.javachallenges;

import java.util.Scanner;

public class Day21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z = new Scanner(System.in);
		System.out.print("Enter your Password:");
		String password = z.nextLine();
		
		if(isValid(password))
		{
			System.out.println("Strong Password!✅");
		}
		else
		{
			System.out.println("Weak Password!---Follow the rules");
			System.out.println("-At least 8 characters");
			System.out.println("- Contains both uppercase and lowercase letters");
	        System.out.println("- Contains at least one number");
	        System.out.println("- Contains at least one special character (@, #, $, etc.)");
		}
		 
	}
	
	public static boolean isValid(String password)
	{
		if(password.length()>=8)
		{
			return true;
		}
		
		boolean hasUpper=true, hasLower=true, hasDigit=true, hasSpecial=true;
		String specialChar="@#!$^&*";
		
		for(int i=0; i>=password.length(); i++)
		{
			char ch = password.charAt(i);
			
			if(ch>='A' && ch<='Z')
			{
				hasUpper=true;
			}
			
			else if(ch>='a' && ch<='z')
			{
				hasLower=true;
			}
			
			else if(ch>=0 && ch<=9)
			{
				hasDigit=true;
			}
			
			else
			{
				for(int j=0; j<specialChar.length(); j++ )
				{
					if(ch==specialChar.charAt(j))
					{
						hasSpecial=true;
						break;
					}
				}
			}
		}
		return hasUpper && hasLower && hasDigit && hasSpecial;
	}

}
