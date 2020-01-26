package com.sprintqa.javaclass6HW;

import java.util.Scanner;

public class HWAssignment3
{

	public static void main (String[] args)
	{
		/*Write a program that reads the number of a shape (1 – square, 2 – circle, 3 – triangle, 4 – rhombus) and prints		
		 *  You have chosen a square (or circle, or triangle, or rhombus, depending on the number). 
		 *  If the number does not correspond to any of the listed shapes, the program should output, There is no such shape!.
		 */
 
		Scanner scanner = new Scanner(System.in);
		 int number;
		 String shape;
		 System.out.println("Please enter any number between 1 to 4");
		 number=scanner.nextInt();
		 shape= scanner.nextLine();
		 switch(number) {
			 case 1: shape="You have chosen a square!";
			 break;
			 case 2: shape="You have chosen a circlee!";
			 break;
			 case 3: shape="You have chosen a triangle!";
			 break;
			 case 4: shape="You have chosen a rhombus!";
			 break;
			 default: shape= "There is no such shape!";
		}
System.out.println(shape);
	}

}
