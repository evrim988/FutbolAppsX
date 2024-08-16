package FootballApp.modules;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
	private static Scanner sc = new Scanner(System.in);
	public static void startMenu() {
		int userInput;
		do {
			userInput = menuEntry();
			menuSelection(userInput);
		} while (userInput != 0);
	}
	
	private static int menuEntry() {
		int userInput=-1;
		boolean validInput = false;
		
		while(!validInput) {
			System.out.println("1-Team Menu");
			System.out.println("2-Player Menu");
			System.out.println("0-Exit");
			System.out.print("Selection: ");
			try {
				userInput = sc.nextInt();
				sc.nextLine();
				if(userInput >= 0 && userInput <= 2) {
					validInput = true;
				}
				else {
					System.out.println("Please enter a valid option!");
				}
			} catch (InputMismatchException e) {
				System.out.println("\nPlease enter a numeric value!");
				sc.next();
			}
		}
		return userInput;
	}
	private static void menuSelection(int userInput) {
		switch (userInput) {
			case 1 -> TeamModule.startTeamMenu();
			case 2 -> PlayerModule.playerMenu();
			case 0 -> System.out.println("Have a nice day!");
			default-> System.out.println("Please enter a valid value!");
		}
	}
}