package Methods;

import java.util.Scanner;

public class Question8_Fibonacci {

	public static void main(String[] args) {
		/*
		Complete a method fib() that will compute Fibonacci numbers
		In fibonacci series, next number is the sum of previous two numbers 
		for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,……... 
		The first two numbers of fibonacci series are 0 and 1.
		Given a number num, print n-th Fibonacci Number.
			Input : 2
			Output : 1			
			Input : 9
			Output : 21		 
		 */			
			Scanner scan = new Scanner(System.in);
			System.out.println("Input a number:");
			int number = scan.nextInt();
			
			fib(number);
			
	}
	
		public static void fib(int number) {
			
			int num1 = 0;;
			int num2 = 1;
			int num3 = 0;
						
			for(int i = 1; i < number; i++) {			
				
		//		System.out.print(num1 + " ");
				num3 = num1+num2;
				num1 = num2;
				num2 = num3;	
			}
			System.out.println("The " + number + "th Fibonacci Number is: " + num1);
		}
	}
	
	


