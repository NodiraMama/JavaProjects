package com.sprintqa.javaclass6HW;

import java.util.Scanner;

public class HWAssignment10
{

	public static void main (String[] args)
	{
		/*Write a program that asks what is user's grade. If grade is A, then print Excellent. If B, then print "Good". If C, then print Average. 
		 * If E, then print "Bad" */

		char grade; 
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your grade: A, B, C, F");
		grade=input.next(). charAt(0);
		if (grade=='A') {
			System.out.println("Excellent");
		}else if (grade=='B') {
			System.out.println("Good");
		}else if( grade == 'C') {
			System.out.println("Avarage");
		}else if(grade == 'E') {
			System.out.println("Bad");
			System.out.println("Study hard!");
		}
			
		}
			
			
		}


