package Methods;

import java.util.Scanner;

public class Questionn17_PopularDrink {

	public static void main(String[] args) {
		
	/*
	 There are a few ways to get this galacticly popular drink if it is 
	 available at the store you can buy it. or you can get it as a gift.
	 the third option is to mix its ingredients (its a secret formula):
	 1 from ingredient1,2 from ingredient2 and 3 from ingredient3.
	 or the alternate recipe: 3 from ingredient1, 1 from ingredient2 and 
	 2 from ingredient3. this ain't coca-cola...
	 You need to have exact amount of ingredients for making the drink. 
	 not less or more getThunderBlazz(boolean avilable,boolean gift, 
	 int ingredient1 , int ingredient2, int ingredient3)

		available = available at store
		gift = got it as a gift
		both are booleans.
		then theres the three ingredients as ints
		example use:
		
		getThunderBlazz(true,false,1,2,3)
		returns true
		
		getThunderBlazz(false,false,1,2,3)
		returns true
		
		getThunderBlazz(false,false,1,5,3)
		returns false
		
		getThunderBlazz(false,false,3,1,2)
		returns true
		
		getThunderBlazz(false,false,3,1,1)
		returns false
		
		getThunderBlazz(false,true,9,7,3)
		returns true

		hint: use parenthesis to separate logical arguments:

		(true|| false && true)||(false&&TRUE) etc

		or put them in their own variables, everything to make it easy to read.
	 */

	Scanner scan = new Scanner(System.in);

	System.out.print("Is ThunderBlazz available at store? If Yes enter true if No enter false: ");
	boolean available = scan.nextBoolean();

	if (available == true) {
		System.out.println(true);
		return;
	}

	System.out.print("Did you get it as a gift? If Yes enter true if No enter false: ");
	boolean gift = scan.nextBoolean();

	if (gift == true) {
		System.out.println(true);
		return;
	}

	System.out.print("To make a drink enter the amount of 3 ingridients followed by space: ");
	int ingridients1 = scan.nextInt();
	int ingridients2 = scan.nextInt();
	int ingridients3 = scan.nextInt();

	getTunderBlazz(available, gift, ingridients1, ingridients2, ingridients3);

}

public static boolean getTunderBlazz(boolean available, boolean gift, int ingridients1, int ingridients2,
		int ingridients3) {
	if (available == true || gift == true) {

		System.out.println(true);
		return true;

	} else if (ingridients1 == 1 && ingridients2 == 2 && ingridients3 == 3
			|| ingridients1 == 3 && ingridients2 == 1 && ingridients3 == 2) {

		System.out.println(true);
		return true;

	} else {
		System.out.println(false);
		return false;
	}
}
}
