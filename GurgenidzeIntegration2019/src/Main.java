import java.util.Scanner;

// Irakli Gurgenidze 1/24/19
// A program integrating skills learned in COP 2006
// Mimics HAL 9000
//ctrl+shift+f to auto format code
public class Main {

  public static void main(String[] args) {
    System.out.println("Hello there");

    int int1 = 2;
    double double1 = 2.0;
    String string1 = "2";

    /* Declare and initialize second integer, double, and String variables. */

    int int2 = 2;
    double double2 = 2.0;
    String string2 = "2";
    /* Print the sum of both integer variables on a new line. */
    System.out.println(int1 + int2);
    /* Print the sum of the double variables on a new line. */
    System.out.println(double1 + double2);
    /* Concatenate and print the String variables on a new line. */
    System.out.println(string1 + string2);
  }
}

class Clock {

  // fields
  private int angleOfHourHand;
  private int angleOfMinuteHand;

  // methods
  public void tellTime() {}

}

class Solution {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int i = scan.nextInt();
    double d = scan.nextDouble();
    scan.nextLine(); // any time you go from number to string, you NEED to clear the line.
    String s = scan.nextLine();
    scan.close();

    System.out.println("String: " + s);
    System.out.println("Double: " + d);
    System.out.println("Int: " + i);
  }
}
