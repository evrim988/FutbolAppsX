package FootballApp.entities;

public class StandingTable extends BaseEntity {
	private static Integer tableCounter=0;
	
	private Integer leagueID;
	private Integer teamID;
	private Integer totalPoint;
	private Integer goalScored;
	private Integer goalConceded;
	private Integer average;
	private Integer gamesPlayed;
	private Integer gamesWon;
	private Integer gamesLost;
	private Integer gamesDrawn;
	private Integer teamPosition;
	
	public StandingTable() {
		super(++tableCounter);
	}
	
	public Integer getLeagueID() {
		return leagueID;
	}
	
	public void setLeagueID(Integer leagueID) {
		this.leagueID = leagueID;
	}
	
	public Integer getTeamID() {
		return teamID;
	}
	
	public void setTeamID(Integer teamID) {
		this.teamID = teamID;
	}
	
	public Integer getTotalPoint() {
		return totalPoint;
	}
	
	public void setTotalPoint(Integer totalPoint) {
		this.totalPoint = totalPoint;
	}
	
	public Integer getGoalScored() {
		return goalScored;
	}
	
	public void setGoalScored(Integer goalScored) {
		this.goalScored = goalScored;
	}
	
	public Integer getGoalConceded() {
		return goalConceded;
	}
	
	public void setGoalConceded(Integer goalConceded) {
		this.goalConceded = goalConceded;
	}
	
	public Integer getAverage() {
		return average;
	}
	
	public void setAverage(Integer average) {
		this.average = average;
	}
	
	public Integer getGamesPlayed() {
		return gamesPlayed;
	}
	
	public void setGamesPlayed(Integer gamesPlayed) {
		this.gamesPlayed = gamesPlayed;
	}
	
	public Integer getGamesWon() {
		return gamesWon;
	}
	
	public void setGamesWon(Integer gamesWon) {
		this.gamesWon = gamesWon;
	}
	
	public Integer getGamesLost() {
		return gamesLost;
	}
	
	public void setGamesLost(Integer gamesLost) {
		this.gamesLost = gamesLost;
	}
	
	public Integer getGamesDrawn() {
		return gamesDrawn;
	}
	
	public void setGamesDrawn(Integer gamesDrawn) {
		this.gamesDrawn = gamesDrawn;
	}
	
	public Integer getTeamPosition() {
		return teamPosition;
	}
	
	public void setTeamPosition(Integer teamPosition) {
		this.teamPosition = teamPosition;
	}
	
	@Override
	public String toString() {
		return "StandingTable{" + "id=" + getId() + ", leagueID=" + getLeagueID() + ", teamID=" + getTeamID() + ", teamPosition=" + getTeamPosition() + ", totalPoint=" + getTotalPoint() + ", gamesPlayed=" + getGamesPlayed() + ", gamesWon=" + getGamesWon() + ", gamesLost=" + getGamesLost() + ", gamesDrawn=" + getGamesDrawn() + ", goalScored=" + getGoalScored() + ", goalConceded=" + getGoalConceded() + ", average=" + getAverage() + '}';
	}
}