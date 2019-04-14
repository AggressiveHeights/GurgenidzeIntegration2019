import java.util.Scanner;

// Irakli Gurgenidze
// 2/21/19
// This class is the introduction to Bored_Bot
public class Introduction {
  public static void introduction() {
    // Display a greeting to the user
    System.out.println("Greetings user! I'm the Bored_Bot, creation of "
        + "Irakli Gurgenidze. My purpose is to entertain you, "
        + "to combat your boredom! \n\nPlease enter a username to continue: ");

    // Get username
    Scanner introScanner = new Scanner(System.in);
    String username = introScanner.nextLine();

    // display input
    System.out.println(
        "\nYou entered \"" + username + "\" as your username. Welcome," + " " + username + "!\n");

    introScanner.close();
  }
}
