//Even Numbers
/*Problem: Print All Even Numbers from 1 to N
Hint: Use a for loop, check if (i % 2 == 0), then print i.
*/

package com.javachallenges;

import java.util.Scanner;

public class Day43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n = z.nextInt();
		
		for(int i =1; i<=n; i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}

		}

	}

}
