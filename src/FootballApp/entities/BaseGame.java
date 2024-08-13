package FootballApp.entities;

import FootballApp.enums.EMatchStatus;

import java.time.LocalDate;
import java.time.LocalTime;

public class BaseGame extends BaseEntity{
	
	private Integer homeTeamID;
	private Integer awayTeamID;
	private LocalDate gameDate;
	private LocalTime startTime;
	private Integer leagueID;
	private EMatchStatus matchStatus;
	
	public BaseGame(Integer id) {
		super(id);
	}
	
	public BaseGame(Integer id, Integer leagueID, Integer homeTeamID,
	                Integer awayTeamID, EMatchStatus matchStatus, LocalDate gameDate,
	                LocalTime startTime) {
		super(id);
		this.leagueID = leagueID;
		this.homeTeamID = homeTeamID;
		this.awayTeamID = awayTeamID;
		this.matchStatus = matchStatus;
		this.gameDate = gameDate;
		this.startTime = startTime;
	}
	
	public Integer getHomeTeamID() {
		return homeTeamID;
	}
	
	public void setHomeTeamID(Integer homeTeamID) {
		this.homeTeamID = homeTeamID;
	}
	
	public Integer getAwayTeamID() {
		return awayTeamID;
	}
	
	public void setAwayTeamID(Integer awayTeamID) {
		this.awayTeamID = awayTeamID;
	}
	
	public LocalDate getGameDate() {
		return gameDate;
	}
	
	public void setGameDate(LocalDate gameDate) {
		this.gameDate = gameDate;
	}
	
	public LocalTime getStartTime() {
		return startTime;
	}
	
	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}
	
	public Integer getLeagueID() {
		return leagueID;
	}
	
	public void setLeagueID(Integer leagueID) {
		this.leagueID = leagueID;
	}
	
	public EMatchStatus getMatchStatus() {
		return matchStatus;
	}
	
	public void setMatchStatus(EMatchStatus matchStatus) {
		this.matchStatus = matchStatus;
	}
	
	@Override
	public String toString() {
		return "BaseGame{" + "id=" + getId() + ", homeTeamID=" + getHomeTeamID() + ", awayTeamID=" + getAwayTeamID() + ", gameDate=" + getGameDate() + ", startTime=" + getStartTime() + ", leagueID=" + getLeagueID() + ", matchStatus=" + getMatchStatus() + '}';
	}
}