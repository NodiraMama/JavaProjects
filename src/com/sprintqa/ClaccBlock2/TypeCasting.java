package com.sprintqa.ClaccBlock2;

public class TypeCasting
{

	public static void main (String[] args)
	{
		// int num1= 10;
		// double num2= num1;
		// System.out.println(num2); // output = 10.0 (small numbers into big numbers=> widening; Implicit data type casting
		
		// double num1 = 10.5;
		// int num2;
		// num2= num1; // program will not run, since double data type (8 byte) will not be converted into int data type (4 byte)
		// num2=(int) num1 // this way program will run; it calls explicit data casting OR narrowing
		
		// int num1 = 376;
		// System.out.println(num1/10); // will print 37, ignoring the decimal. converts to int data type
		// System.out.println(num1/10.0); // will print 37.6
		 int num1= 9;
		 System.out.println(num1/10); // will be zero
		 System.out.println(num1/10.0);// will be 0.9
				 

	}

}
