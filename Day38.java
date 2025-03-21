package com.javachallenges;

import java.util.Scanner;

public class Day38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z = new Scanner(System.in);
		
		System.out.print("Enter a Single-Digit Number: ");
		int n = z.nextInt();
		String word = null;
		
		if(n<0 || n>9)
		{
			System.out.println("Invalid Input!");
		}
		else
		{
			switch(n)
			{
			case 1: word = "One";
			break;
			case 2: word = "Two";
			break;
			case 3: word = "Three";
			break;
			case 4: word = "Four";
			break;
			case 5: word = "Five";
			break;
			case 6: word = "Six";
			break;
			case 7: word = "Seven";
			break;
			case 8: word = "Eight";
			break;
			case 9: word = "Nine";
			break;
			}
			System.out.println("Number in Words: "+word);
			}
		}
	

}
