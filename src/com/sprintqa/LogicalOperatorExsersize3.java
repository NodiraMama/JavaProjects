package com.sprintqa;

public class LogicalOperatorExsersize3
{

	public static void main (String[] args)
	{
		int num1= 5, num2=20, num3=15;
		
		if (num1> num2 && num1> num3) {
		 
			System.out.println(num1);
		}else if (num2>num1 && num2> num3){
			System.out.println(num2);
		}else {
			System.out.println(num3);
		}
		
	}

}
