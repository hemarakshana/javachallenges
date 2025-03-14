//Condition Statement...!

package com.javachallenges;

import java.util.Scanner;

public class Day7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = scanner.nextInt();
		
		
		if(age<=5) {
			System.out.println("Free Ticket");
		}
		else if(age>5 && age<=10) {
			System.out.println("Half Ticket");
		}
		else if(age>=10 && age<=60) {
			System.out.println("Full Ticket");
		}
		else {
			System.out.println("Senior Citizen Ticket");
		}

	}

}
