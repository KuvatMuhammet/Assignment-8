package Methods;

import java.util.Scanner;

public class Questionn15_ToDoList {

	public static void main(String[] args) {
		
	/*
	 We have a to do list app, every time a user adds a task - a few things needed to be checked.
	 It should not be empty. boolean parameter needs to be true
	 taskId should be only 1 greater than currentID. 
	 for example if we have 7 tasks(currentId is 7) so the next task id is 8 , it can't be 10.
		for example:
		
		validateTask(true,2,1)
		returns true
		
		validateTask(true,3,1)
		returns false
		
		validateTask(false,3,2)
		returns false	 
	 */
				
	Scanner scan = new Scanner(System.in);

	System.out.print("Is to do list empty? Enter Yes or No: ");
	String empty = scan.next();

	System.out.print("Enter the next task ID: ");
	int taskID = scan.nextInt();

	System.out.print("Enter the current task ID: ");
	int currentID = scan.nextInt();

	validateTask(empty, currentID, taskID);

}

public static boolean validateTask(String empty, int currentID, int taskID) {

	if (empty.equals("No") || empty.equals("no") && taskID == (currentID + 1)) {
		System.out.println(true);
		return true;
	} else {
		System.out.println(false);
		return false;
	}

}

}
