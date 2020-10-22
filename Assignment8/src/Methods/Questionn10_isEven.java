package Methods;

import java.util.Scanner;

public class Questionn10_isEven {

	public static void main(String[] args) {
		
		/*
		 isEven method gets a number(int) if its even (2,4,8...) 
		 returns true.	if its odd return false.
			
			for example:
			
			isEven(1) --> false
			
			isEven(8) --> true
		 */
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Input a number:");
		int number = scan.nextInt();
		
		isEven(number);

	}

	public static void isEven(int number) {

		if(number%2==0) {
			System.out.println(true);			
		}else {
			System.out.println(false);
		}
		
	}

}
