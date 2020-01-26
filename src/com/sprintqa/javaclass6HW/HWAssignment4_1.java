package com.sprintqa.javaclass6HW;

import java.util.Scanner;

public class HWAssignment4_1
{

	public static void main (String[] args)
	{
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(num1+" "+operation+" "+num2);
		long num1=scanner.nextLong();
		long num2=scanner.nextLong();
		char operation = scanner.next().charAt(0);
		long result=scanner.nextLong();
		if (num2==0 && operation =='/') {
		System.out.println("Devision by 0!");
		} 
	
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


