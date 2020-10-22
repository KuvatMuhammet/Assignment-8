package Methods;

import java.util.Scanner;

public class Questionn14_TruthTable {

	public static void main(String[] args) {
		
		/*
		 This one is about truth table logic, threeLocks gets 3 booleans and returns a boolean.
		 It returns true only if both a and b are true or c is true.
		 */
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter boolean a: ");
		boolean a = scan.nextBoolean();

		System.out.print("Enter boolean b: ");
		boolean b = scan.nextBoolean();

		System.out.print("Enter boolean c: ");
		boolean c = scan.nextBoolean();

		truthTable(a, b, c);

	}

	public static boolean truthTable(boolean a, boolean b, boolean c) {
		if (a == true && b == true || c == true) {
			System.out.println(true);
			return true;
		} else {
			System.out.println(false);
			return false;
		}

	}

}
