package com.javachallenges;

public class Day6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int add = fnAdd(5, 10);
		System.out.println("Sum of two Number:" +add);
		System.out.println();
		
		int sub = fnSub(10,5);
		System.out.println("Sub of two Number:" +sub);
		System.out.println();
		
		int multi = fnMulti(14, 10);
		System.out.println("Multi of two Number:" +multi);
		System.out.println();
		
		int div = fnDiv(40, 8);
		System.out.println("Div of two Number:" +div);
		System.out.println();
		
		int mod = fnDiv(40, 7);
		System.out.println("Mod of two Number:" +mod);
	}
		//Add Method
		public static int fnAdd(int a, int b){
			return (a+b);
			
		}
		
		//Sub Method
		public static int fnSub(int a, int b) {
			return (a-b);
		}
		
		//Multiple Method
		public static int fnMulti(int a, int b){
			return (a*b);
		}
		
		//Divide Method
		public static int fnDiv(int a, int b) {
			return (a/b);
		}
		
		//Modulo Method 
		public static int fnMod(int a, int b) {
			return (a%b);
		}

}
