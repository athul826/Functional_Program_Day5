package com.bridgelabz.functionalProgram;
import java.util.Scanner;

public class FindDistance {

	public static void findDistance(double x, double y){
		
	double distance;
	// to find distance =sqrt(x*x+y*y)
	distance=(Math.sqrt(Math.pow(x,2)+Math.pow(y,2)));
	System.out.printf("the Eucliden distance is :%.2f" ,distance);

	}


	public static void main(String[]args) {
	System.out.println("enter the value for x:");
	Scanner sc=new Scanner(System.in);
	double x=sc.nextDouble();
	System.out.println("enter the value for y:");
	double y=sc.nextDouble();
	findDistance(x,y);
	sc.close();
	
}
}
