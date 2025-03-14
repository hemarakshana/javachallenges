//Math Formulas....!
package com.javachallenges;

public class Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Gonna print some maths formula....!");
		System.out.println(".......................................");
		System.out.println("Square and Cube of a Number");
		int a = 4;
		System.out.println("Square of a number is: " +a*a);
		System.out.println("Cube of a number is: " +a*a*a);
		
		int l=6;
		int b=4;
		System.out.println(" ");
		System.out.println("Rectangle");
		System.out.println("Perimeter of Rectangle: " +2*(l*b));
		System.out.println("Area of Rectangle: " +l*b);
		
		System.out.println(" ");
		System.out.println("Square");
		System.out.println("Perimeter of a Square: " +4*a);		
		System.out.println("Area of Square: " +a*a);
		
		int h=5;
		int base=6;
		int x=2;
		int y=3;
		int z=4;
		System.out.println(" ");
		System.out.println("Triangle");
		System.out.println("Perimeter of a Triangle: " +(x+y+z));
		System.out.println("Area of Triangle: " +0.5*base*h);
		
		int r=7;
		int r2= r*r;
		int r3=r*r*r;
		System.out.println("");
		System.out.println("Circle");
		System.out.println("Area of Circle: " +3.14*r2);
		System.out.println("Circumference of Circle: " + (2*3.14*r));
		
		System.out.println("");
		System.out.println("Sphere");
		System.out.println("Surface Area of Sphere: " +4*3.14*r2);
		System.out.println("Volume of Sphere: " +((4/3)*3.14*r3));
		
		System.out.println("");
		System.out.println("Hemisphere");
		System.out.println("Curved Surface Area of Hemisphere: " +(2*3.14*r2));
		System.out.println("Total Surface Area of Hemisphere: " +(3*3.14*r2));
		System.out.println("Volume of Hemisphere: " +((2/3)*3.14*r3));
		
	
		System.out.println("");
		System.out.println("Cone");
		System.out.println("Curved Surface Area of Cone: " +3.14*r*l);
		System.out.println("Total Surface Area of Cone: " +3.14*r*(l+r));
		System.out.println("Volume of Cone: " +((1/3)*3.14*r2*h));
		

	}

}
