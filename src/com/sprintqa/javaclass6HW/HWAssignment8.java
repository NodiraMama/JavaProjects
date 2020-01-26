package com.sprintqa.javaclass6HW;

import java.util.Scanner;

public class HWAssignment8
{

	public static void main (String[] args)
	{
		/* To qualify for a loan, a
		person must make at least $40,000 and have been working at their current job for at least 2 years.
 		Write a program which takes user’ salary & experience as inputs and output */

		int salary;
		int experience;
		System.out.println("Please enter your salary");
		Scanner scan= new Scanner(System.in);
		salary = scan.nextInt();
		System.out.println("Enter your experience in years");
		experience= scan.nextInt();
		if (salary >= 40000 && experience >= 2) {
			System.out.println("Congratulation! You are qualified for the loan!");
		} else {
			System.out.println("Sorry, you are not qualified for the loan");
		}
	}

}
