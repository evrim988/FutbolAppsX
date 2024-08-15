import FootballApp.databases.ManagerDB;
import FootballApp.databases.PlayerDB;
import FootballApp.databases.TeamDB;
import FootballApp.entities.Player;
import FootballApp.entities.Team;
import FootballApp.modules.TeamModule;
import FootballApp.utility.DataGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);


	public static void main(String[] args) {
		DataGenerator generator = new DataGenerator();
		generator.initialize();

		TeamModule.teamMenu();



	}
}