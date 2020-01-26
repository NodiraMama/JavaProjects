package com.sprintqa.javaclass2;

public class ModulusOperators
{

	public static void main (String[] args)
	{
		

		int mySec=5000;
		int minuts= mySec/60;
		System.out.println(minuts);
		int remainingSec= mySec%60;
		System.out.println(remainingSec);
		int hours=minuts/60;
		int remainingMin=minuts%60;
		System.out.println(remainingMin);
		
		System.out.println(hours);
		System.out.println("5000 seconds is " + hours+  " hour " + remainingMin+ " minuts and " + remainingSec +" seconds "); 
		
		int result=17%3;
		result = 37 % 10;
		System.out.println(result);
		
	}

}
