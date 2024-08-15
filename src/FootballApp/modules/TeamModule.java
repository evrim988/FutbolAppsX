package FootballApp.modules;

import FootballApp.databases.ManagerDB;
import FootballApp.databases.TeamDB;
import FootballApp.entities.Manager;
import FootballApp.entities.Team;
import FootballApp.utility.DataGenerator;
import FootballApp.utility.DatabaseManager;
import com.sun.tools.javac.Main;

import java.util.*;

public class TeamModule {
	static TeamDB teamDB = new TeamDB();
	static Scanner sc = new Scanner(System.in);
	
	public static void teamMenu() {
		int userInput = -1;

		System.out.println("\n---Welcome---");
		do {
			System.out.println("1-List of Teams");
			System.out.println("2-Find Team by ID");
			System.out.println("3-Find Team by Name");
			System.out.println("0-Exit");
			System.out.print("Selection: ");
			try {
				userInput = sc.nextInt();
			}
			catch (InputMismatchException e) {
				System.out.println("\nPlease enter a numeric value!");
				continue;
			}
			finally {
				sc.nextLine();
			}
			menuFunctions(userInput);
			
		} while (userInput != 0);
		
		
	}
	
	private static void menuFunctions(int userInput) {
		switch (userInput) {
			case 1: {
				System.out.println("List of Teams");
				List<Team> teams = DataGenerator.teamDB.listAll();
				teams.stream().map(team -> "TeamID: "+team.getId()+ " TeamName: "+team.getTeamName()).forEach(team-> {
					System.out.println(team);
				});
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
				}
				byTeamName.stream().map(team -> "TeamID: "+team.getId()+ " TeamName: "+team.getTeamName()).forEach(team-> {
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
		
			case 0 : {
				System.out.println("Have nice day!");
				break;
			}
			default:
				System.out.println("Please enter a valid value!");
		}
	}
	
	

}