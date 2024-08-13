package FootballApp.entities;

import java.util.List;

public class League extends BaseEntity{
	private static Integer leagueCounter=0;
	
	private String leagueName;
	private List<Integer> leagueStandingIDList;
	private List<Integer> leagueTeamIDList;
	private List<Integer> leagueFixtureIDList;
	
	public League() {
		super(++leagueCounter);
	}
	
	public League(String leagueName, List<Integer> leagueStandingIDList, List<Integer> leagueTeamIDList, List<Integer> leagueFixtureIDList) {
		super(++leagueCounter);
		this.leagueName = leagueName;
		this.leagueStandingIDList = leagueStandingIDList;
		this.leagueTeamIDList = leagueTeamIDList;
		this.leagueFixtureIDList = leagueFixtureIDList;
	}
	
	public String getLeagueName() {
		return leagueName;
	}
	
	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}
	
	public List<Integer> getLeagueStandingIDList() {
		return leagueStandingIDList;
	}
	
	public void setLeagueStandingIDList(List<Integer> leagueStandingIDList) {
		this.leagueStandingIDList = leagueStandingIDList;
	}
	
	public List<Integer> getLeagueTeamIDList() {
		return leagueTeamIDList;
	}
	
	public void setLeagueTeamIDList(List<Integer> leagueTeamIDList) {
		this.leagueTeamIDList = leagueTeamIDList;
	}
	
	public List<Integer> getLeagueFixtureIDList() {
		return leagueFixtureIDList;
	}
	
	public void setLeagueFixtureIDList(List<Integer> leagueFixtureIDList) {
		this.leagueFixtureIDList = leagueFixtureIDList;
	}
	
	@Override
	public String toString() {
		return "League{" + "id=" + getId() + ", leagueName='" + getLeagueName() + '\'' + ", leagueStandingIDList=" + getLeagueStandingIDList() + ", leagueTeamIDList=" + getLeagueTeamIDList() + ", leagueFixtureIDList=" + getLeagueFixtureIDList() + '}';
	}
}