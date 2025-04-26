//Finding duplicate characters in a given String
package com.javachallenges;

import java.util.Scanner;

public class Day57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s = z.nextLine();
		
		char[] ch = s.toCharArray();
		
		System.out.println("Duplicate Characters are: ");
		for(int i=0; i<ch.length; i++)
		{
			int count=1;
			if(ch[i]=='0')
			{
				continue;
			}
			
			for(int j=i+1; j<ch.length; j++)
			{
				if(ch[i] == ch[j])
				{
					count++;
					ch[j]='0';
				}
			}
			
			if(count > 1 && ch[i]!= ' ')
			{
				System.out.println(ch[i]);
			}
		}
	}

}
