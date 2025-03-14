//Quadrant of Point...!
/*Problem: Given an (x, y) coordinate, determine which quadrant it belongs to:
 
Quadrant 1: (x > 0, y > 0)
Quadrant 2: (x < 0, y > 0)
Quadrant 3: (x < 0, y < 0)
Quadrant 4: (x > 0, y < 0)
*/


package com.javachallenges;

import java.util.Scanner;

public class Day24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z  = new Scanner(System.in);
		System.out.print("Enter your coordinate:");
		int x = z.nextInt();
		int y = z.nextInt();
		
		if(x>0 && y>0)
		{
			System.out.println("The Coordinate (" +x+ "," +y+") belongs to I Quadrant");
		}
		else if(x<0 && y>0)
		{
			System.out.println("The Coordinate (" +x+ "," +y+") belongs to II Quadrant");
		}
		else if(x<0 && y<0)
		{
			System.out.println("The Coordinate (" +x+ "," +y+") belongs to III Quadrant");
		}
		else
		{
			System.out.println("The Coordinate (" +x+ "," +y+") belongs to IV Quadrant");
		}

	}

}
