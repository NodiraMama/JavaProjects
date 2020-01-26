package com.sprintqa.ClaccBlock2;

public class IncementDecrement
{

	public static void main (String[] args)
	{
		int num1=5; 
		num1++;
		num1--;
		System.out.println(num1);
		System.out.println(++num1);// increases the initial number by one; num1= num1+1
		System.out.println(--num1);// decreases the number by one
		
		int num2=7;
		
		System.out.println(num2*2);// value is not stored in memory
		System.out.println(num2);// memory stores only initialized variable, which is num2=7
		
		int numA=7;
		int numB;
		numB=numA++; // numB=7; numB= numA; performs increment /decrement after=> post- fix increment operator
		System.out.println(numA);
		System.out.println(numB);
		
		numB=++numA; //performs increment first, and then assign value to the variable. numB will be 8=> pre-fix increment
	}

}
