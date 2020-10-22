package Methods;

import java.util.Scanner;

public class Questionn13_WaterBill {

	public static void main(String[] args) {
		
		/*
		 This method calculates a water bill, the method gets a double 
		 and returns a double. The more water you use the more it will 
		 cost you (as a fine for wasting water).

			for example:
			
			waterTax(50)
			returns 30
			
			waterTax(55)
			returns 49.5
			
			waterTax(101)
			returns 140.9
			
			waterTax(151)
			returns 235.9
			
			the regular calculation under 50 is
			bill = units * 0.60;
			above 50 is:
			bill = units * 0.90;

			above 100 the calculation is like above 50 but with a 50 as fine
			and above 150 it is the same as above 50 (units *0.90) 
			but with a 100 fine added to the price.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the units:");
		double units = scan.nextInt();

		waterTax(units);

	}

	public static double waterTax(double units) {

		if (units <= 50) {
			double bill = units * 0.60;
			System.out.println(bill);
			return bill;
		} else if (units > 50 && units <= 100) {
			double bill = units * 0.90;
			System.out.println(bill);
			return bill;
		} else if (units > 100 && units <= 150) {
			double bill = (units * 0.90) + 50;
			System.out.println(bill);
			return bill;
		} else {
			double bill = (units * 0.90) + 100;
			System.out.println(bill);
			return bill;
		}
	}
}
