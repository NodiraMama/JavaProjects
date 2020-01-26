package com.sprintqa.javaclass6HW;

import java.util.Scanner;

public class HWAssignment5
{

	public static void main (String[] args)
	{
		/*To be eligible for work, a person must be at least 18 years old and not more than 60 years old. 
		Write a program that takes user’s age as input and outputs if he/she is eligible for work.*/
		
		int age;
		System.out.println("Please enter your age");
		Scanner scan= new Scanner(System.in);
		age=scan.nextInt();
		
		if (age >=18 && age <= 60) {
			System.out.println("You are eligible to work!");
		}else {
			System.out.println("You are not eligible to work!");
		}
	
	}

}
