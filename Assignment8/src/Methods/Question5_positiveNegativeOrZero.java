package Methods;

import java.util.Scanner;

public class Question5_positiveNegativeOrZero {

	public static void main(String[] args) {
		/*
			Create a method called sign.  It gets a number and tells you 
			if its positive, negative or zero.

			for example :
			sign(5) => 1
			sign(-30)=> -1
			sign(0) => 0

			sign gets an int parameter.	Print out 1,-1 or 0 depending on the input			
			the parameter should be entered by user (create a scanner object)
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int number = scan.nextInt();
		
		sign(number);

	}

	public static void sign(int number) {
		
		if(number<0) {
			System.out.println(-1);
		}else if(number>0) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
	}

}
