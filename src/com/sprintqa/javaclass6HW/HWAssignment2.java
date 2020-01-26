package com.sprintqa.javaclass6HW;

import java.util.Scanner;

public class HWAssignment2
{

	public static void main (String[] args)
	{
		/*All salespeople get a payment of $800 a week. Salespeople who exceed 10 sales get an additional bonus of $200. 
		Write a program which extra sales as input from the user and calculate the employee’s total salary in a week */

		double bonus= 200;
		double baseSalary= 800;
		double extraSales;
	
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter the number of extra sales for the last week:");
		extraSales= scan.nextInt();
		if (extraSales >=1 ) { // Assuming that required input is the number of extra sales and not the number of total sales.
			System.out.println("Your total weekly salary is $" + (baseSalary + bonus));
			System.out.println("Thank you for your hard work!");
		}else{
			System.out.println ("Yor total salary for a week is $ " + baseSalary);
		}
			
			
		
				{
						
					}
	}

}
