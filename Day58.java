//Convert String to charArray
package com.javachallenges;

import java.util.Scanner;

public class Day58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z = new Scanner(System.in);
		  System.out.print("Enter a String: ");
		  String s = z.nextLine();
		  
		  char[] arr = s.toCharArray();
		  
		  System.out.println("Characters in the Array: ");
		  for(int i=0; i<arr.length; i++)
		  {
			  System.out.println(arr[i]);
		  }
	}

}
