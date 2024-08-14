import FootballApp.databases.PlayerDB;
import FootballApp.databases.TeamDB;
import FootballApp.entities.League;
import FootballApp.entities.Player;
import FootballApp.entities.Team;
import FootballApp.entities.attributes.TechnicalAttributes;
import FootballApp.enums.EPosition;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static PlayerDB playerDB = new PlayerDB();
	static TeamDB teamDB = new TeamDB();
	public static void main(String[] args) {
		Team team1=new Team("Galatasaray",1,new ArrayList<>(),"Istanbul","RamsPark",90d,5d);
		Team team2=new Team("Fenerbahce",1,new ArrayList<>(),"Istanbul","Kadikoy",100d,10d);
		teamDB.save(team1);
		teamDB.save(team2);
		
		teamDB.findByID(1).ifPresent(System.out::println);
		TechnicalAttributes ta1 = new TechnicalAttributes(9,8,5,3,2);
		TechnicalAttributes ta2 = new TechnicalAttributes(9,10,3,8,1);
		Player player1=new Player("Alperen",20,"Turkiye",ta1,1,50d,5d,EPosition.ST);
		System.out.println(player1);
		playerDB.save(player1);
		Player player2=new Player("Atakan",20,"Turkiye",ta2,2,50d,5d,EPosition.ST);
		System.out.println(player2);
		playerDB.save(player2);
		
		
		
		
		
		
		League league1=new League("Turkiye Super Ligi",new ArrayList<>(),new ArrayList<>(),new ArrayList<>());
		
	}
}