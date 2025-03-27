//Basic Loops
/*Problem: Print Numbers from 1 to N
Hint: Use a for loop starting from 1 to N and print each number.
*/


package com.javachallenges;

import java.util.Scanner;

public class Day41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n = z.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			System.out.println(i);
		}
		

	}

}
