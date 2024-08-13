package entities;

import enums.EResult;

import java.time.LocalDate;

public class Match extends BaseEntity{
	private static Integer matchCounter;
	
	private Integer homeTeamID;
	private Integer awayTeamID;
	private LocalDate gameDate;
	private Integer homeScore;
	private Integer awayScore;
	private EResult result;
	
	
	public Match(int id) {
		super(++matchCounter);
	}
	
	public Match(Integer homeTeamID, Integer awayTeamID, LocalDate gameDate, Integer homeScore, Integer awayScore,
	             EResult result) {
		super(++matchCounter);
		this.homeTeamID = homeTeamID;
		this.awayTeamID = awayTeamID;
		this.gameDate = gameDate;
		this.homeScore = homeScore;
		this.awayScore = awayScore;
		this.result = result;
	}
	
	public Integer getHomeTeam() {
		return homeTeamID;
	}
	
	public void setHomeTeam(Integer homeTeamID) {
		this.homeTeamID = homeTeamID;
	}
	
	public Integer getAwayTeam() {
		return awayTeamID;
	}
	
	public void setAwayTeam(Integer awayTeamID) {
		this.awayTeamID = awayTeamID;
	}
	
	public LocalDate getGameDate() {
		return gameDate;
	}
	
	public void setGameDate(LocalDate gameDate) {
		this.gameDate = gameDate;
	}
	
	public Integer getHomeScore() {
		return homeScore;
	}
	
	public void setHomeScore(Integer homeScore) {
		this.homeScore = homeScore;
	}
	
	public Integer getAwayScore() {
		return awayScore;
	}
	
	public void setAwayScore(Integer awayScore) {
		this.awayScore = awayScore;
	}
	
	public EResult getResult() {
		return result;
	}
	
	public void setResult(EResult result) {
		this.result = result;
	}
	
	@Override
	public String toString() {
		return "Match{" + "id=" + getId() + ", homeTeamID=" + homeTeamID + ", awayTeamID=" + awayTeamID + ", gameDate=" + getGameDate() + ", homeScore=" + getHomeScore() + ", awayScore=" + getAwayScore() + ", result=" + getResult() + '}';
	}
}