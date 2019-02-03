import java.util.Scanner;

// The Bored_Bot
// Irakli Gurgenidze 1/24/19
// This program contains a variety of random information and activities that are 
// meant to to combat boredom
//ctrl+shift+f to auto format code
public class Main {

	public static void main(String[] args) {
    // Display a greeting to the user
	System.out.println("Greetings user! I'm the Bored_Bot, creation of "
			+ "Irakli Gurgenidze. My purpose is to entertain you, "
			+ "to combat your Boredom! Please enter a username to continue: ");
	
	// Get username
	Scanner introScanner = new Scanner(System.in);
	String username = introScanner.nextLine();
	
	// The Java language supports 8 primitive data types: Bytes (8 bits),
	// Shorts (16 bits), Ints (32 bits), Longs (64 bits), Floats (32 bits)
	// Doubles (64 bits), Booleans (true or false), and Chars (16 bits).
	// Of these, all but booleans and chars deal with numbers. Their difference
	// is in the size of numbers they can contain. Booleans can be assigned a 
	// "true" or "false" value. They are used heavily and logic. Chars are Java's
	// native text data type. The contain one character and one character only. 
	// Chars are also the building blocks of Strings, an object class heavily 
	// used in java, composed of an array of Chars. 
	
	// Here's an example of the four main variables (boolean, int double, String) 
	// in action: 
	
	//String
	System.out.println("\nYou entered \"" + username + "\" as your username. \n");
	
	//int
	System.out.println("For my first trick, I will square any integer you enter: ");
	int toBeSquared = introScanner.nextInt();
	System.out.println("Your result is: " + (toBeSquared * toBeSquared));
	
	//double
	System.out.println("\n Now, I know what you're thinking. \"What about doubles?\""
			+ "Enter one here: ");
	double toBeSquaredDos = introScanner.nextDouble();
	System.out.println("Your result is: " + (toBeSquaredDos * toBeSquaredDos));
	
	//boolean
	System.out.println("\n Here's a little trick...\nEnter a boolean value and I'll "
			+ "tell you if you are right. Right about what? Well... that doesn't "
			+ "really matter: ");
	boolean userBoolean = introScanner.nextBoolean();
	if(userBoolean == true) {
		System.out.println("Congratulations! You were wrong! ");
	}
	else {
		System.out.println("You guessed correctly! No, you do not win a prize. ");
	}
	
	//String class methods
	System.out.println("\nFor my next trick, I will compeltely dissect your"
			+ " next input. Please enter a one-token String: ");
	String anaString = introScanner.nextLine();
	int anaLength = anaString.length();
	String anaLowerCase = anaString.toLowerCase();
	String anaUpperCase = anaString.toUpperCase();
	System.out.println("\nYou entered a total of " + anaLength + " characters. "
			+ "Here's your entry in all lowercase: " + anaLowerCase + 
			"\n Here's yout entry in all uppercase: " + anaUpperCase);
	
	//format strings using escape sequences
	System.out.println("\nNow enter a String token so I may indent it for no reason: "
			+ ");
	String indInput = introScanner.nextLine();
	System.out.println("And here it is: \n\t" + indInput);
	
	//Casting is taking an object out of one data type and putting it into another
	System.out.println("\nNow I will convert your String into a double. "
			+ "Enter a decimal: ");
	String casting = introScanner.nextLine();
	doubleVarA = Double.parseDouble(casting);
	System.out.println("\nYou entered the value " + doubleVarA + ". To prove that I"
			+ "actually casted, here's your value squared: " + 
			(doubleVarA * doubleVarA));
	
	
	
  }
}
