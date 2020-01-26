package com.sprintqa.java.class3;

import java.util.Scanner;

public class Practice4
{

	public static void main (String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int num1=10, num2=20;
		int operation= scan.nextInt();
					
		System.out.println("Please enter operation to perform" +" ");
				System.out.println("1 for add");
				System.out.println("2 for sub");
				System.out.println("3 for mul");
				System.out.println("4 for div");
				
		if(operation ==1) {
			System.out.println(num1+num2);
		}else if(operation==2) {
			System.out.println(num1-num2);
		}else if(operation==3) {
			System.out.println(num1*num2);
		}else if(operation==4) {
			System.out.println(num1/num2);
		}else {
			System.out.println("Please enter num between 1-4");
	}

}
}