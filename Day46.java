//Pattern
/*
 Write a Java program to print a below pattern using nested loops.
 
* * *   *
    *   *
* * * * *
*   * 
*   * * *

*/

package com.javachallenges;

public class Day46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		for(int i=0; i<n; i++) 
		{
			for(int j=0; j<n; j++)
			{
				if(i==n || j==2 || i==2 || j==n 
							|| i+j==0 || i+j==8 
								||((i==3) &&(j==0)) || ((i==4) && (j==0)) 
									|| ((i==4)&&(j==3)) || ((i==0)&&(j==1)) 
										|| ((i==0)&&(j==4)) || ((i==1)&&(j==4)) ) 
				{
					System.out.print("*"+" ");
				}
					
				else
				{
					System.out.print(" "+" ");
				}
			}
				
				
				System.out.println();
		}

	}

}
