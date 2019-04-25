import java.util.Scanner;
// Irakli Gurgenidze 1/24/19
// This class consists of code that makes up the activity selection menu

public class MainMenu {
  public static void executeMenu() { // executes the main menu
    // Introduction
    Introduction.introduction();

    Scanner scan = new Scanner(System.in);
    int activityIndex = GeneralMethods.getActivityIndex(scan);

    GeneralMethods.executeActivityChosen(activityIndex);
  }

}
