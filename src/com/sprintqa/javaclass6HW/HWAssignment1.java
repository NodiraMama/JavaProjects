package com.sprintqa.javaclass6HW;

public class HWAssignment1
{

	public static void main (String[] args)
	{
		/*Write a program to compute the distance in miles light travels in 100 days, when the approximate speed of light is equal to 186000 miles per second. The output of your program should be:
		Output: In 100 days, light will travel about 16070400000000 miles*/

		 int days = 100;
		 int hours= days*24;
		 System.out.println(hours);
		 int minuts= hours*60;
		 System.out.println(minuts);
		 int seconds= minuts*60;
		 System.out.println(seconds);
		 long resultInMiles= seconds*186000L;
		 System.out.println(resultInMiles);
		 System.out.println("In 100 days, light will travel about " +  resultInMiles + " miles");
	 	 
			
	}

}
