package FootballApp.modules;


import FootballApp.entities.Player;
import FootballApp.entities.Team;
import FootballApp.utility.DataGenerator;

import javax.xml.crypto.Data;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class PlayerModule {
	static Scanner sc = new Scanner(System.in);
	
	public static void playerMenu() {
		int userInput = -1;
		
		do {
			System.out.println("1-List of all Player ID's by Team");
			System.out.println("2-Find Player by ID");
			System.out.println("3-Find Player by Name");
			System.out.println("4-Find Player by Team");
			System.out.println("0-Exit");
			System.out.print("Selection: ");
			try {
				userInput = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nPlease enter a numeric value!");
				continue;
			} finally {
				sc.nextLine();
			}
			menuFunctions(userInput);
			
		} while (userInput != 0);
		
	}
	
	private static void menuFunctions(int userInput) {
		switch (userInput) {
			case 1: {
				System.out.println("List of all Player ID's by Team");
				listOfPlayers();  // Takım ve oyuncu ID'lerini listeleyen metodu çağır
				getPlayerDetails(); // Takım ID'sine göre oyuncuları listeleyen metodu çağır
				break;
			}
			
			case 2: {
				listPlayerByID();
				break;
			}
			case 3: {
				listPlayerByName();
				break;
			}
			case 4: {
				listPlayerByTeam();
				break;
			}
			case 0: {
				System.out.println("Have a nice day!");
				break;
			}
			default:
				System.out.println("Please enter a valid value!");
		}
	}
	
	private static void listPlayerByTeam() {
		System.out.println("Enter a Team Name: (Return=0)");
		String teamName = sc.nextLine();
		if(teamName.equalsIgnoreCase("0")){
			return;
		}
		List<Player> byTeamName = DataGenerator.playerDB.findByTeamName(teamName);
		for (Player player : byTeamName) {
			System.out.println(player);
		}
	}
	
	private static void listPlayerByName() {
		System.out.println("Enter a Player Name: (Return=0)");
		String playerName = sc.nextLine();
		List<Player> byPlayerName = DataGenerator.playerDB.findByPlayerName(playerName);
		if (byPlayerName.isEmpty()) {
			System.out.println("Player not found!");
			return;
		}
		byPlayerName.stream().map(player -> "PlayerID: " + player.getId() + " PlayerNameSurname: " + player.getName()+" "+player.getSurName() ).forEach(player -> {
			System.out.println(player);
		});
		System.out.println("Enter the Player ID that you want to see by details: ");
		Integer playerID = sc.nextInt();
		Optional<Player> playerByID = DataGenerator.playerDB.findByID(playerID);
		if (playerByID.isPresent()) {
			System.out.println(playerByID.get());
		}
	}
	
	private static void listPlayerByID() {
		System.out.println("Enter a Player ID: (Return=0)");
		Integer playerID = sc.nextInt();
		if(playerID==0){
			return;
		}
		Optional<Player> playerByID = DataGenerator.playerDB.findByID(playerID);
		if (playerByID.isPresent()) {
			System.out.println(playerByID.get());
		}
		else{
			System.out.println("Player not found!");
		}
	}
	
	public static void listOfPlayers() {
		List<Team> teams = DataGenerator.teamDB.listAll();
		for (Team team : teams) {
			System.out.println("Team ID: " + team.getId() + ", Team Name: " + team.getTeamName());
			System.out.println("Team Players ID List: " + team.getTeamPlayerIDList());
		}
	}
	public static void getPlayerDetails() {
		System.out.println("Which player do you want to select? Please enter the Player ID: (Return=0)");
		Integer playerID = sc.nextInt();
		if(playerID==0){
			return;
		}
		Optional<Player> player = DataGenerator.playerDB.findByID(playerID);
		if (player.isPresent()) {
			System.out.println(player.get());
		}
		}
}