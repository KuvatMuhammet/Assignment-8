package Methods;

import java.util.Scanner;

public class Question2_Cube {

	public static void main(String[] args) {
		
		/*
		 	Create a method called cube. Write all required code inside this 
		 	method in order to ask the user for a number and then prints 
		 	the cubed value of that number:
			Example:			
						input: 5
						output: 125
		 */
		
	Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number:");
		int number = scan.nextInt();
		
		cube(number);
		
	}

	public static void cube(int number) {
		
		int cube = number*number*number;
		
		System.out.println("The cubed value of " + number + " = " + cube);
		
	}

}
