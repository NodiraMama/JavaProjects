package com.sprintqa.javaclass6HW;

import java.util.Scanner;

public class HWAssignment9
{

	public static void main (String[] args)
	{
		/*Write a program to find out what to do for the following temperatures: 
Temperatures is greater than 100, print out "Stay inside it's too hot"
Temperatures is greater than 50 and less than 99, print out "Wear winter clothes"
Temperatures is greater than 30 and less than 49, print out "Wear winter clothes"
Temperatures is greater than 10 and less than 29, print out "Stay inside it's too cold"
Lastly if the temperature  is lower than all previous values, print out "Call for help it's too cold outside"*/

		int temperature;
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter temperature");
		temperature= scan.nextInt();
		
		if (temperature >100) {
			System.out.println("Stay inside it's too hot");
		} else if (temperature >50 && temperature <99) {
			System.out.println("Wear winter clothes");
		} else if (temperature >30 && temperature <49) {
			System.out.println("Wear winter clothes");
		} else if (temperature >10 && temperature <29) {
			System.out.println("Stay inside it's too cold");
		} else {
			System.out.println("Call for help it's too cold outside!");
		}
		
		
		
	}

}
