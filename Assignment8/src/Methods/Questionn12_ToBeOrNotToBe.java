package Methods;

import java.util.Scanner;

public class Questionn12_ToBeOrNotToBe {

	public static void main(String[] args) {
		
		/*
		 The danish prince most famous quote is "to be or not to be". 
		 thats a classic example of boolean logic. the hamletQuote method 
		 only returns true if one of or both of the boolean parameters is true.
			example:

			hamletQuote(true, false)
			returns true

			hamletQuote(false,true)
			returns true
			
			hamletQuote(true,true)
			returns true
			
			hamletQuote(false,false)
			returns false

			hint: use the truth table for this one, this can be done 
			with one if and a logical operator.
		 */
		
		Scanner scan =new Scanner(System.in);
		System.out.print("Do you live in EU? Enter Yes or No:");
		String answer1 = scan.next();
		System.out.print("Are you student? Enter Yes or No:");
		String answer2 = scan.next();
		
		hamletQuote(answer1,answer2);

	}

	public static void hamletQuote(String answer1, String answer2) {
		
		if(answer1.equals("Yes") && answer2.equals("No") || answer1.equals("No") && answer2.equals("Yes") || answer1.equals("Yes") && answer2.equals("Yes") || answer1.equals("No") && answer2.equals("No") ) {
			
			System.out.println(true);
				
		}else{
		
			System.out.println(false);
		}
	}
}
