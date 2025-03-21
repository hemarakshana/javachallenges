//Hotel Room Booking Price Calculation
/*Problem:

Single Room: ₹1000 per day
Double Room: ₹1800 per day
Suite: ₹5000 per day
More than 5 days → 10% discount
*/

package com.javachallenges;

import java.util.Scanner;

public class Day33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z = new Scanner(System.in);
		
		int singleRoom = 1000;
		int doubleRoom = 1800;
		int suite = 5000;
		
		System.out.print("Select Room Type: 1. Single  2.Double  3.Suite");
		int roomType = z.nextInt();
		
		System.out.print("Enter number of Days: ");
		int days = z.nextInt();
		
		int price;
		
		switch(roomType) {
		case 1:
			price = days * 1000;
			break;
			
		case 2:
			price = days * 1800;
			break;
			
		case 3:
			price = days * 5000;
			break;
		
			default:
				System.out.println("Invalid room type selected.");
				return;
		}
		
		if(days>5)
		{
			price *= 0.9;
		}
		
		System.out.println("Total Price: Rs." +price);
	}

}
