package com.sprintqa.javaclass6HW;

import java.util.Scanner;

public class HWAssignment6
{

	public static void main (String[] args)
	{
		// TODO Auto-generated method stub

		
		int pennies;
		int nickels; 
		int dimes; 
		int quarters; 
		
			
		Scanner scan=new Scanner(System.in);
		System.out.println("How many pennies?");
		pennies=scan.nextInt();
		
		System.out.println("How many nickels?");
		nickels=scan.nextInt();
		
		System.out.println("How many dimes?");
		dimes=scan.nextInt();
		
		System.out.println("How many quartes?");
		quarters=scan.nextInt();
		
		int cents= pennies + (nickels*5)+ (dimes*10)+ (quarters*25);
		int remain = (cents-100);
		System.out.println(cents);
		if (cents==100) {
			System.out.println("You won!");
		} else if (cents > 100) {
			System.out.println("You went over by " + remain);
		}  else {
			System.out.println("You went under by " + remain*(-1));
		}
	}

}
