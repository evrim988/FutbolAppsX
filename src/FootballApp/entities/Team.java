package FootballApp.entities;

import FootballApp.databases.PlayerDB;
import FootballApp.databases.TeamDB;

import java.util.List;

public class Team extends BaseEntity {
	private static Integer teamCounter=0;
	
	private String teamName;
	private Integer currentLeagueID;
	private List<Integer> teamPlayerIDList;
	private String teamLocation;
	private String stadiumName;
	
	public Team() {
		super(++teamCounter);
	}
	
	public Team(String teamName, Integer currentLeagueID, List<Integer> teamPlayerIDList, String teamLocation, String stadiumName) {
		super(++teamCounter);
		this.teamName = teamName;
		this.currentLeagueID = currentLeagueID;
		this.teamPlayerIDList = teamPlayerIDList;
		this.teamLocation = teamLocation;
		this.stadiumName = stadiumName;
	}
	
	public String getTeamName() {
		return teamName;
	}
	
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	public Integer getCurrentLeagueID() {
		return currentLeagueID;
	}
	
	public void setCurrentLeagueID(Integer currentLeagueID) {
		this.currentLeagueID = currentLeagueID;
	}
	
	public List<Integer> getTeamPlayerIDList() {
		return teamPlayerIDList;
	}
	
	public void setTeamPlayerIDList(List<Integer> teamPlayerIDList) {
		this.teamPlayerIDList = teamPlayerIDList;
	}
	
	public String getTeamLocation() {
		return teamLocation;
	}
	
	public void setTeamLocation(String teamLocation) {
		this.teamLocation = teamLocation;
	}
	
	public String getStadiumName() {
		return stadiumName;
	}
	
	public void setStadiumName(String stadiumName) {
		this.stadiumName = stadiumName;
	}
	
	@Override
	public String toString() {
		return "Team "
				+ "ID: " + getId()
				+ ", Name=" + getTeamName()
				+ ", TeamLeagueID=" + getCurrentLeagueID()
				+ ", Location=" + getTeamLocation()
				+ ", Stadium=" + getStadiumName()
				+ ", TeamPlayersIDList=" + getTeamPlayerIDList();
	}
}