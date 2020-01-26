package com.sprintqa.java.class3;

import java.util.Scanner;

public class ScannerSvetaNodira
{
	public static void main (String[] args)
	{
		int traveler;
		int month;
		Scanner nodi= new Scanner(System.in);
			
		System.out.println("How many people are travelling?");
		traveler= nodi.nextInt();
		if(traveler>=8 && traveler <=10){
			System.out.println("What month are you travelling?");
			
			month= nodi.nextInt();
			if (month ==7); {
				System.out.println("You are traveling to Sarasota");
			
			}
		}
	}
}