package FootballApp.modules;

import FootballApp.databases.ManagerDB;
import FootballApp.databases.TeamDB;
import FootballApp.entities.Manager;
import FootballApp.entities.Team;
import FootballApp.utility.DatabaseManager;
import com.sun.tools.javac.Main;

import java.util.*;

public class TeamModule {
	static TeamDB teamDB = new TeamDB();
	static Scanner sc = new Scanner(System.in);
	
	public static void teamMenu() {
		int userInput = -1;
		TeamModule.addTeams(teamDB);
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
				List<Team> teams = teamDB.listAll();
				teams.stream().map(team -> "TeamID: "+team.getId()+ " TeamName: "+team.getTeamName()).forEach(team-> {
					System.out.println(team);
				});
				break;
			}
			
			case 2: {
				System.out.println("Enter Team ID: ");
				Integer teamID = sc.nextInt();
				Optional<Team> teamByID = teamDB.findByID(teamID);
				if (teamByID.isPresent()) {
					System.out.println(teamByID.get());
				}
				break;
			}
			case 3: {
				System.out.println("Enter the Team Name: ");
				String teamName = sc.nextLine();
				List<Team> byTeamName = teamDB.findByTeamName(teamName);
				if (byTeamName.isEmpty()) {
					System.out.println("Team not found!");
				}
				byTeamName.stream().map(team -> "TeamID: "+team.getId()+ " TeamName: "+team.getTeamName()).forEach(team-> {
					System.out.println(team);
				});
				System.out.println("Enter the Team ID that you want to see by details: ");
				Integer teamID = sc.nextInt();
				Optional<Team> teamByID = teamDB.findByID(teamID);
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
	
	
	public static void addTeams(TeamDB teamDB){
		Team team1 = new Team("Fenerbahce",1,new ArrayList<>(),"Istanbul","Sukru Saracoglu Stadyumu",15_000_000.0,20_000_000.0);
		Team team2 = new Team("Galatasaray",1,new ArrayList<>(),"Istanbul","RAMS Park",10_000_000.0,25_000_000.0);
		Team team3 = new Team("Besiktas",1,new ArrayList<>(),"Istanbul","Tupras Stadyumu",10_000_000.0,25_000_000.0);
		Team team4 = new Team("Trabzonspor",1,new ArrayList<>(),"Trabzon","Papara Park",8_000_000.0,22_000_000.0);
		Team team5 = new Team("Basaksehir FK",1,new ArrayList<>(),"Basaksehir/Istanbul"," Basaksehir Fatih Terim Stadyumu",10_000_000.0,15_000_000.0);
		Team team6 = new Team("Caykur Rizespor",1,new ArrayList<>(),"Gündogdu/Rize","Caykur Didi Stadyumu",5_000_000.0,10_000_000.0);
		Team team7 = new Team("Samsunspor",1,new ArrayList<>(),"Canik/Samsun","19 Mayıs Stadyumu",3_000_000.0,5_000_000.0);
		Team team8 = new Team("Kayserispor",1,new ArrayList<>(),"Kayseri","Kayseri Kadir Has Sehir Stadyumu",1_000_000.0,2_000_000.0);
		Team team9= new Team("Eyupspor",1,new ArrayList<>(),"Istanbul","Arda Turan Stadyumu",20_0000_000d,30_000_000d);
		Team team10= new Team("Antalyaspor",1,new ArrayList<>(),"Antalya","Antalya Sehir Stadi",30_0000_000d,40_000_000d);
		Team team11= new Team("Adanaspor",1,new ArrayList<>(),"Adana","Adana Fatih Terim Stadyumu",35_0000_000d,50_000_000d);
		Team team12= new Team("Alanyaspor",1,new ArrayList<>(),"Antalya","Alanya Rus Turist Stadyumu",22_0000_000d, 35_000_000d);
		Team team13 = new Team("Sivasspor", 1,  new ArrayList<>(),"Sivas", "Yeni 4 Eylul Stadi", 3_000_000d, 500_000d);
		Team team14 = new Team("Kasimpasa", 1,  new ArrayList<>(),"Istanbul", "Recep Tayyip Erdogan Stadyumu", 3_000_000d, 500_000d);
		Team team15 = new Team("Konyaspor", 1,  new ArrayList<>(),"Konya", "Medas Konya Buyuksehir Stadyumu", 2_500_000d, 450_000d);
		Team team16 = new Team("Gaziantep FK ", 1,  new ArrayList<>(),"Gaziantep", "Kalyon Stadyumu ", 2_000_000d, 400_000d);
		Team team17= new Team("Hatayspor",1,new ArrayList<>(),"Hatay","Mersin Stadyumu",2_000_000d,200_000d);
		Team team18= new Team("Goztepe",1,new ArrayList<>(),"Izmir","Gursel Aksel Stadyumu",2_500_000d,250_000d);
		Team team19= new Team("Bodrum FK",1,new ArrayList<>(),"Mugla","Bodrum Ilce Stadi",1_500_000d,120_000d);
		Team team20= new Team("MKE Ankaragucu",1,new ArrayList<>(),"Ankara","Eryaman Stadyumu",1_700_000d,100_000d);
		teamDB.save(team1);
		teamDB.save(team2);
		teamDB.save(team3);
		teamDB.save(team4);
		teamDB.save(team5);
		teamDB.save(team6);
		teamDB.save(team7);
		teamDB.save(team8);
		teamDB.save(team9);
		teamDB.save(team10);
		teamDB.save(team11);
		teamDB.save(team12);
		teamDB.save(team13);
		teamDB.save(team14);
		teamDB.save(team15);
		teamDB.save(team16);
		teamDB.save(team17);
		teamDB.save(team18);
		teamDB.save(team19);
		teamDB.save(team20);
	}
	
}