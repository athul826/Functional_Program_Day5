package com.bridgelabz.functionalprogram;
import java.util.Scanner;
import java.lang.Math;


public class FindQuadratic {

	 static void quadraticRoot(double a, double b, double c) {
		
		double root1 = 0, root2 = 0;
		//to find  the root of equation is a*x*+b*x+c.
		double delta= ((b * b) - (4 * a * c));
		if (delta > 0) {
			
			    root1 = (-(double)b + Math.sqrt(delta)) / (2*a);
			    root2 = (-(double)b - Math.sqrt(delta))  / (2*a);
			    System.out.printf("roots of equation x1 : %.2f x2 : %.2f", root1 , root2);
			    
		}
		else if
			(delta==0){
			
			root1=(-(double)b -Math.sqrt(delta))/(2 * a);
			System.out.printf("root of equation x1 : %.2f", root1 );
		} 
		else {
			System.out.print("root of equation is imaginary");
		}
	 }
			public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter value for a :");
		 double a = sc.nextDouble();
		 System.out.print("enter value for b : ");
		 double b = sc.nextDouble();
		 System.out.print("enter value for c: ");
		 double c=sc.nextDouble();
		 // call the method
		 quadraticRoot(a,b,c);
		 sc.close();
		
		

	

	}
}