package com.sprintqa.javaclass2;

public class LogicalOperators
{

	public static void main (String[] args)
	{
		int ticketPrice= 10;
		boolean isStudent=false;
		int age= 17; 
		int age_1= 58;
		
		if (age <= 15 || age_1 >60) {
			System.out.println("Ticket costs 5 dollars");
			
			if(isStudent) {
				
				System.out.println("Ticket costs 5 dollars");
			}
				
		}else {
			System.out.println(ticketPrice);

	}
	}
}
