package com.sprintqa.java.class3;

import java.util.Scanner;

public class ScannerExample
{

	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in);
		
		int numA= 23, numB= 56;
		int operation=sc.nextInt ();
		System.out.println("Enter any number");
		System.out.println("1 for add");
		System.out.println("2 for sub");
		System.out.println("3 for mul");
		System.out.println("4 for dev");
		
		if(operation ==1)
			System.out.println(numA+numB);

	}

}
