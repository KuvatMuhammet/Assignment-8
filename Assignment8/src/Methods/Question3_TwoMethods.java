package Methods;

public class Question3_TwoMethods {

	public static void main(String[] args) {
		
		/*
		 	Create 2 methods called hello() and world(). Provide an implementation for 
		 	both of them in order to print an appropriate message. So hello() method 
		 	should print "Hello" and world() method should print "World!".
			output: Hello World!
		 */
		
		String word1 = "Hello "; 
		String word2 = "World!";
		
		hello(word1);
		world(word2);
		
	}

	public static void hello(String word1) {
		
		System.out.print(word1);
	}

	public static void world(String word2) {
		
		System.out.println(word2);
		
		
	}

}
