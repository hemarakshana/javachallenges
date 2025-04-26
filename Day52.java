//String class important methods
package com.javachallenges;

import java.util.Scanner;

public class Day52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub        
		Scanner z = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = z.nextLine();

        // Important String methods
        System.out.println("Length: " + s.length());
        System.out.println("Uppercase: " + s.toUpperCase());
        System.out.println("Lowercase: " + s.toLowerCase());
        System.out.println("First character: " + s.charAt(0));
        System.out.println("Substring (first 3 characters): " + s.substring(0, Math.min(3, s.length())));
        System.out.println("Replaced 'a' with '@': " + s.replace('a', '@'));
        System.out.println("Starts with 'Hello': " + s.startsWith("Hello"));
        System.out.println("Ends with 'world': " + s.endsWith("world"));
        System.out.println("Index of 'e': " + s.indexOf('e'));
        System.out.println("Last index of 'e': " + s.lastIndexOf('e'));
        System.out.println("Trimmed String: '" + s.trim() + "'");
        System.out.println("Is Empty: " + s.isEmpty());
        
	}

}
