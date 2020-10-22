package Methods;

import java.util.Scanner;

public class Questionn16_BookARoom {

	public static void main(String[] args) {
		
	/*
		To book a room first it needs to be available for rent and make sure its available at the date selected:
		the room is already booked between 7/1/2018 - 7/8/2018 and not available accepting bookings only for year of 2018
		example:
		
		simpleRoomBook(false,2,1,2018)
		return false
		
		simpleRoomBook(true,2,1,2018)
		return true
		
		simpleRoomBook(true,7,2,2018)
		return false
	 */
	Scanner scan = new Scanner(System.in);

	System.out.print("Are there any room available for booking? If Yes enter true if No enter false: ");
	boolean available = scan.nextBoolean();

	System.out.println("Enter the month, day and year followed by space: ");
	int month = scan.nextInt();
	int day = scan.nextInt();
	int year = scan.nextInt();

	simpleRoomBook(available, month, day, year);

}

public static boolean simpleRoomBook(boolean available, int month, int day, int year) {

	if (available == true && year == 2018) {
		if (month == 7) {
			if (day > 0 && day < 9) {
				System.out.println(false);
			}
			return false;
		} else {
			System.out.println(true);
			return true;
		}

	} else {
		System.out.println(false);
		return false;
	}
}
}
