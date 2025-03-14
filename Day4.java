//Operators.....!

package com.javachallenges;

public class Day4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("......Operators......"); 
		System.out.println(" ");
		System.out.println("1. Arithmetic Operator");
		int a = 10;
		int b = 5;
		
		int sum = a+b;
		System.out.println("Sum of two numbers is: " +sum);
		System.out.println(" ");
		
		int sub = a-b;
		System.out.println("Sub of two numbers is: " +sub);
		System.out.println(" ");
		
		int multi = a*b;
		System.out.println("Multiplle of two numbers is: " +multi);
		System.out.println(" ");
		
		int div = a/b;
		System.out.println("Divison of the two number is: " +div);
		System.out.println(" ");
		
		int mod = a%b;
		System.out.println("Modules of the two nummber is: " +mod);
		System.out.println(" ");
		
		System.out.println("2. Relational Opeerator");
		
		int x=30;
		int y=20;
		int z=10;
		System.out.println(x>y);
		System.out.println(x<y);
		System.out.println(x<=y);
		System.out.println(x>=y);
		System.out.println(x==y);
		System.out.println(x!=y);
		 
		System.out.println("");
		System.out.println("3.Logical Operator");
		System.out.println(x<y && y>z);
		System.out.println(x>y || y<z);
		System.out.println(x<y != y>z);
		 
		System.out.println("");
		System.out.println("4.Ternary Operator");
		System.out.println(x&y);
		System.out.println(x|y);
		System.out.println(x^y);
		System.out.println(x>>y);
		System.out.println(x<<y);
		
		

	}

}
