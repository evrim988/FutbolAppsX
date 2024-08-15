package FootballApp.modules;

import FootballApp.databases.TeamDB;
import FootballApp.entities.Player;
import FootballApp.entities.Team;
import FootballApp.utility.DataGenerator;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class TeamModule {
	static TeamDB teamDB = new TeamDB();
	static Scanner sc = new Scanner(System.in);
	
	public static void teamMenu() {
		int userInput = -1;
		
		
		do {
			System.out.println("1-List of Teams");
			System.out.println("2-Find Team by ID");
			System.out.println("3-Find Team by Name");
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
				System.out.println("List of Teams");
				listOfTeams();  // Takım ve oyuncu ID'lerini listeleyen metodu çağır
				getTeamDetails(); // Takım ID'sine göre oyuncuları listeleyen metodu çağır
				break;
			}
			
			case 2: {
				System.out.println("Enter Team ID: ");
				Integer teamID = sc.nextInt();
				Optional<Team> teamByID = DataGenerator.teamDB.findByID(teamID);
				if (teamByID.isPresent()) {
					System.out.println(teamByID.get());
				}
				break;
			}
			case 3: {
				System.out.println("Enter the Team Name: ");
				String teamName = sc.nextLine();
				
				List<Team> byTeamName = DataGenerator.teamDB.findByTeamName(teamName);
				if (byTeamName.isEmpty()) {
					System.out.println("Team not found!");
					return;
				}
				byTeamName.stream().map(team -> "TeamID: " + team.getId() + " TeamName: " + team.getTeamName()).forEach(team -> {
					System.out.println(team);
				});
				System.out.println("Enter the Team ID that you want to see by details: ");
				Integer teamID = sc.nextInt();
				Optional<Team> teamByID = DataGenerator.teamDB.findByID(teamID);
				if (teamByID.isPresent()) {
					System.out.println(teamByID.get());
				}
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
	
	public static void listOfTeams() {
		List<Team> teams = DataGenerator.teamDB.listAll();
		for (Team team : teams) {
			System.out.println("Team ID: " + team.getId() + ", Team Name: " + team.getTeamName());
			System.out.println("Team Players ID List: " + team.getTeamPlayerIDList());
		}
	}
	
	public static void getTeamDetails() {
		System.out.println("Which team do you want to select? Please enter the Team ID: (For Main Menu=0)");
		Integer teamID = sc.nextInt();
		if(teamID==0){
			return;
		}
		Optional<Team> teamByID = DataGenerator.teamDB.findByID(teamID);
		if (teamByID.isPresent()) {
			System.out.println(teamByID.get());
		}
		List<Player> players = DataGenerator.playerDB.findByTeamID(teamID);
		if (players.isEmpty()) {
			System.out.println("No players found for this team.");
		} else {
			players.forEach(System.out::println);
		}
	}
}