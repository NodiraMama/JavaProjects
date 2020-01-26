package com.sprintqa.javaclass2;

import java.util.Scanner; 
public class SwitchExample4
{

	public static void main (String[] args) 	{
		int num1=40, num2=20, choice;
		System.out.println("Please enter operation");
		System.out.println("1 for add");
		System.out.println("2 for sub");
		System.out.println("3 for mul");
		System.out.println("4 for div");
	
	
	Scanner sc = new Scanner(System.in);
	choice = sc.nextInt();
	switch (choice) {
		
		case 1: 
			System.out.println(num1+num2);
			break;
		case 2:
			System.out.println(num1-num2);
			break;
		case 3: 
			System.out.println(num1*num2);
			break;
		case 4: 
			System.out.println(num1/num2);
			break;
			default: 
				System.out.println("No operation is performed");	
	}
	
}
}