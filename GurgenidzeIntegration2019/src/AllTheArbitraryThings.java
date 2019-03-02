import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

// Irakli Gurgenidze
//2/21/19
//This class contains all of the little requirements, as detailed on the course 
//website,  for the integration project
public class AllTheArbitraryThings {
	/* The Java language supports 8 primitive data types: Bytes (8 bits),
	 Shorts (16 bits), Ints (32 bits), Longs (64 bits), Floats (32 bits)
	 Doubles (64 bits), Booleans (true or false), and Chars (16 bits).
	 Of these, all but booleans and chars deal with numbers. Their difference
	 is in the size of numbers they can contain. Booleans can be assigned a 
	 "true" or "false" value. They are used heavily and logic. Chars are Java's
	 native text data type. The contain one character and one character only. 
	 Chars are also the building blocks of Strings, an object class heavily 
	 used in java, composed of an array of Chars. 
	 Here's an example of the four main variables (boolean, int double, String) 
	 in action: */
	
	// initialize scanner
	
	// Scop refers to the portion of code where a variable can be accessed
	
	// A variable is a value that is subject to change 
			
	public static void runArbitraryPSIOne() {		
		
		Scanner arbitraryScannerOne = new Scanner(System.in);
		
		//int
		System.out.println("For my first trick, I'll square any integer you enter: ");
		int toBeSquared = arbitraryScannerOne.nextInt();
		System.out.println("Your result is " + (toBeSquared * toBeSquared) + "!");
	
		//double
		System.out.println("\nNow, I know what you're thinking. How about doubles?"
			+ " Enter one here: ");
		double toBeSquaredDos = arbitraryScannerOne.nextDouble();
		System.out.println("Your result is " + (toBeSquaredDos * toBeSquaredDos));
	
		//boolean
		System.out.println("\nHere's a little trick...\nEnter a boolean value and I'll "
			+ "tell you if you're right. Right about what? Well... that doesn't "
			+ "really matter: ");
		boolean userBoolean = arbitraryScannerOne.nextBoolean();
		if(userBoolean == true) {
		System.out.println("Congratulations! You were wrong! ");
		}
		else {
		System.out.println("You guessed correctly! No, you don't win a prize. ");
		}
	
		//String class methods
		System.out.println("\nFor my next trick, I'll tell you about a String. Please "
			+ "enter one (only one token): ");
		String anaString = arbitraryScannerOne.nextLine();
		int anaLength = anaString.length();
		String anaLowerCase = anaString.toLowerCase();
		String anaUpperCase = anaString.toUpperCase();
		System.out.println("\nYou entered a total of " + anaLength + " characters. "
			+ "Here's your entry in all lowercase: " + anaLowerCase + 
			"\nHere's your entry in all uppercase: " + anaUpperCase);
			
		//format strings using escape sequences
		System.out.println("\nPlease enter another String token. "
			+ "I'll demonstrate an esape sequence: "
			);
		String indInput = arbitraryScannerOne.nextLine();
		System.out.println("And here it is, using the \\t sequence: \n\t" + indInput);
		
		//Casting is taking an object out of one data type and putting it into another
		System.out.println("\nYet another one of my many abilities is casting. "
			+ "I'll convert your String into a double. "
			+ "Enter a decimal: ");
		String casting = arbitraryScannerOne.nextLine();
		double doubleVarA = Double.parseDouble(casting);
		System.out.println("\nYou entered the value " + doubleVarA + ". To prove that I"
				+ "actually casted, here's your value squared: " + 
			(doubleVarA * doubleVarA));
		arbitraryScannerOne.close();
	}
	
	public static void runArbitraryPSITwo() { // arbitrary code to meet requirements of PSI 2 
		
		Random randomSelectorA = new Random();
		// Math class
		double toBeSquared = 5.0;
		double squared = Math.pow(toBeSquared, 2); // example of Math.pow()
		
		System.out.println(toBeSquared + " squared equals " + squared + ".");
		
		String exampleA = "Hello";
		String exampleB = "Goodbye";
		
		while(exampleA.equals(exampleB) != true) { // while loop example. equals tests the equality of two Strings
			if(exampleA.compareTo(exampleB) == (randomSelectorA.nextInt(3) - 1)) { // compareTo determines which String is lexiographically larger
				System.out.println("Strings compared");
				continue; // continue ends the current iteration of the loop and progreses to the next one
			}
			else {
				System.out.println("Loop broken");
				break; // break ends the cycling of the loop
			}
		}
		
		int count = 25;
		do { // example of a do while loop
			System.out.println("The count is at " + count + ". The loop"
					+ " terminates when it falls to 20 or below.");
			count--;
		} while(count > 20); // relational operator example
		System.out.println("Loop terminated.");
		
		for(int i = 0; i < 10; i++) { // example of a for loop
			System.out.println("I just ran " + i + " time(s)!");
		}
		
		
		
		/*
		 * Just like the order of operations in mathematics, Java
		 * has its own order of operations for built-in expressions.
		 * More info, including a detailed order of all Java operations, 
		 * can be found at https://introcs.cs.princeton.edu/java/11precedence/
		 */
	}
}