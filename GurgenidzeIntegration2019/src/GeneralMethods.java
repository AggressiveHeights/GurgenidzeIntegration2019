import java.util.Scanner;
import java.util.Random;

// Irakli Gurgenidze
// 3/1/19
// class to create general methods to be used in future code
public class GeneralMethods {

  public static int getActivityIndex(Scanner a) { // method to get activity index. The code on this
                                                  // line is
    // referred to as a header.
    // Scanner indexScanner = new Scanner(System.in);
    System.out.println("\nNow, time to pick an activity! Please select one of the following: ");

    System.out.println("\nTo play 'Trajectory!', please enter '1': \n"
        + "To play 'True or False?', please enter '2': \n"
        + "To play 'Trajectory!', please enter '3': \n"
        + "To play 'Twist-Tac-Toe', please enter '4': \n"
        + "To run 'AllTheArbitraryThings' (this one isn't very fun, trust me), please enter '5': ");


    int index = a.nextInt();
    // indexScanner.close();// close scanner

    return index;
  }

  public static void executeActivityChosen(int choice) { // execute an activity
    Random pickerA = new Random(); // initialize Random object

    int decision = (choice == 0) ? (decision = pickerA.nextInt(6)) : (decision = choice); // get the
                                                                                          // user's
                                                                                          // pick

    switch (decision) { // determine which activity to run
      case 1:
        // activity one
        System.out.println("Trajectory! is still a work in progress. Please pick another option.");
        break;
      case 2:
        // activity two
        System.out.println("This one is a surprise! Please pick another option.");
        break;
      case 3:
        // activity three
        TwistTacToe.playTTT();
        break;
      case 4:
        // activity four
        System.out.println("Test 4");
        break;
      default:
        // catch invalid input
        System.out.println("It appears your input is invalid.");
        break;
    }
  }
}
