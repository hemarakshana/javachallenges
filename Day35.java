//Internet Speed Categorization
/*Problem: Classify internet speed:

Below 2 Mbps → Slow
2-10 Mbps → Normal
Above 10 Mbps → Fast*/


package com.javachallenges;

import java.util.Scanner;

public class Day35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z = new Scanner(System.in);
		System.out.print("Enter your Internet Speed: ");
		int n = z.nextInt();
		
		if(n>10)
		{
			System.out.println("Fast");
		}
		else if(n>=2 && n<=10)
		{
			System.out.println("Normal");
		}
		else
		{
			System.out.println("Slow");
		}

	}

}
