package Methods;

import java.util.Scanner;

public class Questionn11_C_Profits {

	public static void main(String[] args) {
		
		/*
		  c_profits gets the buyPrice(int) and sellPrice(int) and determines 
		  if there was a profit or loss.
		  it returns a string value that can be "profit","loss","no loss"

			for example:
			c_profis(100,1500)
			returns : "profit"
			
			c_profis(20,5)
			returns : "loss"
			
			c_profis(100,100)
			returns : "no loss"
		 */
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Input a buying price:");
		int buyPrice = scan.nextInt();
		System.out.println("Input a selling price:");
		int sellPrice = scan.nextInt();
		
		c_profits(buyPrice, sellPrice);

	}

	public static void c_profits(int buyPrice, int sellPrice) {
		
		if(sellPrice>buyPrice) {
			System.out.println("profit");
		}else if(sellPrice<buyPrice) {
			System.out.println("loss");
		}else if(sellPrice==buyPrice) {
			System.out.println("no loss");
		}	
		
	}

}
