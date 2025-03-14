//Check Divisibility Rules
/*Problem:
Divisible by 3 & 5 → Print "FizzBuzz"
Divisible by 3 only → Print "Fizz"
Divisible by 5 only → Print "Buzz"
Else → Print the number
*/


package com.javachallenges;

import java.util.Scanner;

public class Day28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z = new Scanner(System.in);
		System.out.print("Enter an Number:");
		int n = z.nextInt();
		
		if(n%3==0 & n%5==0)
		{
			System.out.println("FizzBuzz");
		}
		else if(n%3==0)
		{
			System.out.println("Fizz");
		}
		else if(n%5==0)
		{
			System.out.println("Buzz");
		}
		else
		{
			System.out.println("OOPS! Given Number "+n+ " is Wrong.");
		}
	}

}
