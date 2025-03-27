//Greatest and Smallest Number..!
/*Write a Java program to find the greatest (maximum) and smallest (minimum) numbers in a given array of integers.
*/

package com.javachallenges;

public class Day49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks = { 85, 96, 77, 45, 61 };

		int max = marks[0];
		int min = marks[0];

		for (int i = 0; i < marks.length; i++) {
			if (marks[i] > max) {
				max = marks[i];
			}
			if (marks[i] < min) {
				min = marks[i];
			}
		}
		System.out.println("Greatest Number is: " + max);
		System.out.println("Smallest Number is: " + min);

	}

}
