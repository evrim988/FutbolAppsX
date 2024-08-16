package FootballApp.modules;


import FootballApp.databases.ManagerDB;
import FootballApp.entities.Manager;
import FootballApp.utility.DataGenerator;

import java.util.InputMismatchException;
import java.util.Optional;
import java.util.Scanner;

public class ManagerModule {
	static Scanner sc = new Scanner(System.in);
	public static Manager loggedManager = null;
	
	public static void startManagerMenu() {
		int userInput;
		do {
			userInput = managerMenuEntry();
			managerMenuSelection(userInput);
		} while (userInput != 0);
	}
	
	private static int managerMenuEntry() {
		int userInput = -1;
		boolean validInput = false;
		
		while (!validInput) {
//			if(loggedManager == null)
			System.out.println("1-Log In");
//			if(loggedManager != null) {
				System.out.println("2-Team View");
				System.out.println("3-Player View");
				System.out.println("4-Manager Information");
//			}
				System.out.println("0-Main Menu");
				System.out.print("Selection: ");
			
			try {
				userInput = sc.nextInt();
				sc.nextLine();
				if (loggedManager == null && (userInput == 1 )) {
					validInput = true;
				} else if(loggedManager!= null && (userInput == 2 || userInput == 3 || userInput==4)){
					validInput=true;
				} else if(userInput == 0){
					validInput = true;
				}
				else {
					System.out.println("Please enter a valid option!\n");
				}
			} catch (InputMismatchException e) {
				System.out.println("\nPlease enter a numeric value!");
				sc.next();
			}
		}
		return userInput;
	}
	
	private static void managerMenuSelection(int userInput) {
		switch (userInput) {
			case 1 -> managerLogIn();
			case 2 -> managerTeamDisplay();
	//		case 3 -> managerPlayerDisplay();
	//		case 4 -> managerInfoDisplay();
			case 0 -> System.out.println("Returning to Main Menu...");
			default -> System.out.println("Please enter a valid value!");
		}
	}
	
	private static void managerTeamDisplay() {
		System.out.println("1-");
	
	}
	
	public static Manager managerLogIn() {
		System.out.println("Enter your Username:");
		String username = sc.nextLine();
		System.out.println("Enter your Password:");
		String password = sc.nextLine();
		Optional<Manager> byUsernameAndPassword = DataGenerator.managerDB.findByUsernameAndPassword(username, password);
		if (byUsernameAndPassword.isPresent()) {
			System.out.println("Login Successful!");
			loggedManager = byUsernameAndPassword.get();
            return byUsernameAndPassword.get();
		}
		System.out.println("Invalid credentials. Please try again.");
		return null;
	}
	
	
}