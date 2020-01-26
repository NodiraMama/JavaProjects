package com.sprintqa.javaclass2;
import java.util.Scanner;

public class SwitchStatement
{

	public static void main (String[] args)
	{
		
					System.out.println("Enter any number");
					Scanner sc= new Scanner(System.in);
					int season= sc.nextInt();
					String name;
		do {
			switch(season) {
				case 1:  name= "Spring";
				break;
				case 2: name = "Summer";
				break;
				case 3: name = "Autum";
				break;
				case 4: case 5: case 6: default:
					name = "No season!";
					break;
					}
			System.out.println(name);
		}while ();
			
		}
		 {
			
		}
		
				}
	}
}

	}



