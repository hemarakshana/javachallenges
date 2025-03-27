//Pattern
/*Write a Java program to print a specific pattern using nested loops.

* * * * *
*         
*   * * * 
*   *   * 
* * *   * 
*
*/
package com.javachallenges;

public class Day47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if( i==n || j==0 || i==0 || j==n 
						|| ((i==4) && (j==4)) || ((i==2) &&(j==2)) 
						|| ((i==4) && (j==1)) || ((i==4) && (j==2)) 
						|| ((i==3) && (j==2)) || ((i==2) && (j==3)) 
						|| ((i==2) && (j==4)) || ((i==3) && (j==4)) )
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
