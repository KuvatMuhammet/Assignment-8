package Methods;

import java.util.Scanner;

public class Question9_XMax {

	public static void main(String[] args) {
		/*
		 	Create a method called max. It gets two ints, x and max.
			x is the test case, max is what we test against.
			if x is bigger than max return max
			in any other case return x.
			for example:
			max(1,10)
			returns 1
			max(11,5)
			returns 5
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input the number X:");
		int x = scan.nextInt();
		
		System.out.println("Input the number Max:");
		int max = scan.nextInt();
		
		max(x, max);
		

	}

	public static int max(int x, int max) {
		
		if(x>max) {
			System.out.println(max);
			return max;
		}else {
			System.out.println(x);
			return x;
		}
		
	}

}
