package Methods;

import java.util.Scanner;

public class Question7_Palindrome {

	public static void main(String[] args) {
		/*
		 Complete a method isPalindrome() that will check if the number is a palindrome. 
		 Print your result as a boolean (true or false).
		 Do not convert int into a string!
			Example:
			input: 1001
			output: true
			Example:
			input: 1234
			output: false
		 */		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = scan.nextInt();
		
		isPalindrome(number);

	}

	public static void isPalindrome(int number) {
		
		int sum = 0;
		int reminder;
		int temp = number;
		
		while(number>0) {
			reminder = number%10;
			sum = (sum*10)+reminder;
			number = number/10;
		}
		if(temp == sum) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}

}
