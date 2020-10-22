package Methods;

import java.util.Scanner;

public class Question1_AddTwoNumbers {

	public static void main(String[] args) {
		
		/*
		 	Create a method called "plus", its return is void and it gets no arguments.
			It asks the user to input two numbers, then it will add them and print the result.
			Create a scanner within the plus method.
			Example:			
					enter first number:
					1
					enter second number:
					2
					result: 3
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int firstNumber = scan.nextInt();
		
		System.out.println("Enter second number:");
		int secondNumber = scan.nextInt();

		
		plus(firstNumber, secondNumber);
		
		
		
	}
	
	public static void plus(int firstNumber, int secondNumber) {
		
		int result = firstNumber + secondNumber;
		System.out.println("Sum of two numbers: " + result);
	}
		
}


