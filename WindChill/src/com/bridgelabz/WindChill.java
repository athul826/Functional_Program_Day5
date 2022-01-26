package com.bridgelabz;
import java.util.Scanner;

public class WindChill {


		public static void windChillCalutate(double t , double v){
			
			if(t < 50 && v > 3 && v < 120){
				
				double windChill = (double)(35.74 + (0.6215 * t) + (((t * 0.4275) - 35.75) * (Math.pow(v, 0.16))));
				System.out.printf(" Wind Chill : %.2f " , windChill);
			}
			else {
				System.out.printf("Invalid Input");
			}
		}
		    public static void main(String[] args) {
			
		
			
	                  	Scanner sc = new Scanner(System.in);
			         System.out.print("Enter the temperature in fahrenheit : ");
			     double t = sc.nextInt();
			   System.out.print("Enter the wind speedin miles per hour : ");
			  double v = sc.nextInt();
		windChillCalutate(t , v);
			sc.close();

	}

}
