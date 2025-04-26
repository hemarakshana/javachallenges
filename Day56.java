//Count of each character in a given String
package com.javachallenges;

import java.util.Scanner;

public class Day56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String s = z.nextLine();
		
		char[] ch = s.toCharArray();
		
		for(int i=0; i<s.length();i++)
		{
			int count=1;
			if(ch[i]==0)
			{
				continue;
			}
			
			for(int j=i+1; j<ch.length; j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					ch[j]='0';
				}
			}
			if(ch[i]!='0' && ch[i]!=' ') {
				System.out.println(ch[i]+" = " +count);
			}
		}
		
	}

}
