//Simple ATM Withdrawal
/*Problem: Write a program where the user enters a withdrawal amount. The program should check if the balance is sufficient and process the transaction.
Hint: Use a predefined balance and check if the withdrawal amount is <= balance.

*/


package com.javachallenges;

import java.util.Scanner;

public class Day16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z = new Scanner(System.in);
		int balance = 150000;
		System.out.println("Enter an amount for withdrawal: ");
		int n = z.nextInt();
		
		if(n<=balance)
		{
			System.out.println("The Balance is Sufficient.You can Withdraw your Money and proceed with your Transaction.");
		}
		
		else
		{
			System.out.println("The Balance is Insufficient. You can't withdraw money.");
		}
		

	}

}
