//ATM Withdrawal with Balance Check
/*Problem: Accept an amount to withdraw and check if it’s:

A multiple of 100
Not more than the available balance
If both conditions are met, print the updated balance
*/


package com.javachallenges;

import java.util.Scanner;

public class Day27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z = new Scanner(System.in);
		
		double balance = 10000;
		System.out.println("Enter an Amount to Withdraw:");
		int amount = z.nextInt();
		
		
		if(amount%100!=0)
		{
			System.out.println("Error: The amount must be the multiple of 100!");
		}
		else if(amount > balance)
		{
			System.out.println("Error: Insufficient balance!");
		}
		else
		{
			balance -= amount;
			System.out.println("Withdrawal Successful! Your new balance is:"+balance);
		}
	}

}
