package com.sprintqa.javaclass6HW;

import java.util.Scanner;

public class HWAssignment4
{

	public static void main (String[] args)
	{
		// Write a simple calculator that reads three values from a line: the first number, the operator, and the second number, separated by single spaces.

		long num1, num2;
		char operation = '*';		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter first number");
		num1=scanner.nextLong();
		System.out.println("Please enter second number");
		num2=scanner.nextLong();
		System.out.println("Please enter operation: +, -, *, /");
		operation = scanner.next().charAt(0);
		
		if (num2==0 && operation =='/') {
		System.out.println("Devision by 0!");
		} long result=0;
	
		switch (operation) {
		case '+': result = num1 + num2;
			break; 
		case '-': result = num1 - num2;
			break;
		case '/': result = num1 / num2;
			break;
		case '*': result = num1 * num2;
			break;
		default: 
			System.out.println("Unknown operator!");
		}
		System.out.println(num1+" "+operation+" "+num2+"= "+result);
}
}