package Methods;

import java.util.Scanner;

public class Question6_Next3numbers {

	public static void main(String[] args) {
		/*
		 Create a method called next3 . This method gets an int argument and prints 
		 the next 3 numbers after that number. Call the method from main method 
		 and pass num to it.
			enter number: 1
			next 3 are:	2 3 4			
			(put a space between numbers)
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = scan.nextInt();
		
		next3(number);
		
	}

	public static void next3(int number) {		
			
			System.out.print("Next 3 numbers are: " + (number+1) + " " + (number+2) + " " + (number+3));
			
		}
		
		
	}


