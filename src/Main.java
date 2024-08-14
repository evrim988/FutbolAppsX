import FootballApp.databases.ManagerDB;
import FootballApp.databases.PlayerDB;
import FootballApp.databases.TeamDB;
import FootballApp.entities.League;
import FootballApp.entities.Manager;
import FootballApp.entities.Player;
import FootballApp.entities.Team;
import FootballApp.entities.attributes.TechnicalAttributes;
import FootballApp.enums.EPosition;
import FootballApp.modules.TeamModule;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static PlayerDB playerDB = new PlayerDB();
	static TeamDB teamDB = new TeamDB();
	static ManagerDB managerDB = new ManagerDB();
	public static void main(String[] args) {
		
		TeamModule.addTeams(teamDB);
		
		TeamModule.teamMenu();
	}
}