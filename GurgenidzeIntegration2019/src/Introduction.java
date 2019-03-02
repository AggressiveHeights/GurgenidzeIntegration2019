import java.util.Scanner;

//Irakli Gurgenidze
//2/21/19
//This class is the introduction to Bored_Bot
public class Introduction {
	public static void introduction(){
		// Display a greeting to the user
		System.out.println("Greetings user! I'm the Bored_Bot, creation of "
				+ "Irakli Gurgenidze. My purpose is to entertain you, "
				+ "to combat your boredom! \n\nPlease enter a username to continue: ");
		
		// Get username
		Scanner introScanner = new Scanner(System.in);
		String username = introScanner.nextLine();
		
		//String
		System.out.println("\nYou entered \"" + username + "\" as your username. Welcome,"
				+ " "+ username + "!\n");
		
		//int
		System.out.println("For my first trick, I'll square any integer you enter: ");
		int toBeSquared = introScanner.nextInt();
		System.out.println("Your result is " + (toBeSquared * toBeSquared) + "!");
		
		//double
		System.out.println("\nNow, I know what you're thinking. How about doubles?"
				+ " Enter one here: ");
		double toBeSquaredDos = introScanner.nextDouble();
		System.out.println("Your result is " + (toBeSquaredDos * toBeSquaredDos));
		
		//boolean
		System.out.println("\nHere's a little trick...\nEnter a boolean value and I'll "
				+ "tell you if you're right. Right about what? Well... that doesn't "
				+ "really matter: ");
		boolean userBoolean = introScanner.nextBoolean();
		if(userBoolean == true) {
			System.out.println("Congratulations! You were wrong! ");
		}
		else {
			System.out.println("You guessed correctly! No, you don't win a prize. ");
		}
		
		//String class methods
		System.out.println("\nFor my next trick, I'll tell you about a String. Please "
				+ "enter one (only one token): ");
		String anaString = introScanner.nextLine();
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
		String indInput = introScanner.nextLine();
		System.out.println("And here it is, using the \\t sequence: \n\t" + indInput);
		
		//Casting is taking an object out of one data type and putting it into another
		System.out.println("\nYet another one of my many abilities is casting. "
				+ "I'll convert your String into a double. "
				+ "Enter a decimal: ");
		String casting = introScanner.nextLine();
		double doubleVarA = Double.parseDouble(casting);
		System.out.println("\nYou entered the value " + doubleVarA + ". To prove that I"
				+ "actually casted, here's your value squared: " + 
				(doubleVarA * doubleVarA));
		introScanner.close();
	}
}
