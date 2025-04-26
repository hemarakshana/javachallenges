//Count of vowels in a given String
package com.javachallenges;

import java.util.Scanner;

public class Day55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z = new Scanner(System.in);
		System.out.print("Enter a String to count VOWELS: ");
		String s = z.nextLine();
		
		int count = 0;
		String vowels = "";
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch=='A'|| ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				count++;
				vowels += ch+"  ";
			}
			
		}
		System.out.print("Count of vowels in the string is " +count+ " and the vowels are " +vowels);
		
	}

}
