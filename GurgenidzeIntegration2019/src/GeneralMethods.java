import java.util.Scanner;
import java.util.Random;

//Irakli Gurgenidze
//3/1/19
//class to create general methods to be used in future code
public class GeneralMethods {
	
	public static int getActivityIndex() { // method to get activity index. The code on this line is referred to as a header. 		
		Scanner indexScanner = new Scanner(System.in);
		
		System.out.println("Please enter an integer between 1 and 5 to select an "
				+ "activiy. Enter 0 to pick a random one: "); // will be bumped up to ten activities when possible
	
		int activityIndex = indexScanner.nextInt(); // user input
		indexScanner.close();// close scanner
		
		return activityIndex;
	}
	
	public static void executeActivityChosen(int choice) { // execute an activity	
		Random pickerA = new Random(); // initialize Random object
		
		int decision = (choice == 0) ? (decision = pickerA.nextInt(6)) : (decision = choice); // set the decicion value
		
		switch (decision) { // determine which activity to run
			case 1 :
				// activity one
				System.out.println("Test 1");
				break;
			case 2 :
				// activity two
				System.out.println("Test 2");
				break;
			case 3 : 
				// activity three
				System.out.println("Test 3");
				break;
			case 4 : 
				// activity four
				System.out.println("Test 4");
				break;
			case 5 : 
				// activity five
				System.out.println("Test 5");
				break;
			default :
				// catch invalid input
				System.out.println("It appears your input is invalid.");
				break;
		}
	}
}
