package Methods;

import java.util.Scanner;

public class Question4_HollowRect {

	public static void main(String[] args) {
		/*
		 	Create a method printHollowRect that prints a 5 on 5 hollow rectangle:

					*****
					*   *
					*   *
					*   *
					*****

			hint: you will need to use two nested for loops for that, and an if that 
			checks if its the last or first iteration of the loop 
			(so you will know whet to print "*" or " ")

		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input the number of rows:");
		int rows = scan.nextInt();
		
		System.out.println("Input the number of columns:");
		int columns = scan.nextInt();

		printHollowRect(rows, columns);

	}

	public static void printHollowRect(int rows, int columns) {
		
		for(int i = 1; i <= rows; i++) {
			
			for(int j = 1; j <= columns; j++) {

				if(i==1 || i==rows || j==1 || j==columns) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
