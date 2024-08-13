package entities;

import entities.attributes.TechnicalAttributes;
import enums.EPosition;

public class Player extends BaseEntity {
	private static Integer playerCounter;
	
	private String playerName;
	private Integer playerAge;
	private String playerNationality;
	private Integer playerOverallRating;
	private Integer currentTeamID;
	private Double playerValue;
	private Double playerWage;
	private EPosition playersPosition;
	private Integer technicalAttributesID;
	
	public Player() {
		super(++playerCounter);
	}
	
	public Player(String playerName, Integer technicalAttributesID, Integer playerAge, String playerNationality, Integer teamID, Double playerValue, Double playerWage, EPosition EplayersPosition) {
		super(++playerCounter);
		this.playerName = playerName;
		this.playerAge = playerAge;
		this.playerNationality = playerNationality;
//		this.playerOverallRating = playerOverallRating(technicalAttributesID);
		this.currentTeamID=teamID;
		this.playerValue = playerValue;
		this.playerWage = playerWage;
		this.playersPosition = playersPosition;
	}
	
	private Integer playerOverallRating(TechnicalAttributes tec) {
		this.playerOverallRating = (tec.getDribbling()+ tec.getFinishing()+tec.getPass()+tec.getTackle()
				+tec.getShotPower())/5;
		return playerOverallRating;
	}
	
	public String getPlayerName() {
		return playerName;
	}
	
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	public Integer getPlayerAge() {
		return playerAge;
	}
	
	public void setPlayerAge(Integer playerAge) {
		this.playerAge = playerAge;
	}
	
	public String getPlayerNationality() {
		return playerNationality;
	}
	
	public void setPlayerNationality(String playerNationality) {
		this.playerNationality = playerNationality;
	}
	
	public Integer getPlayerOverallRating() {
		return playerOverallRating;
	}
	
	public void setPlayerOverallRating(Integer playerOverallRating) {
		this.playerOverallRating = playerOverallRating;
	}
	
	public Integer getPlayersCurrentClub() {
		return currentTeamID;
	}
	
	public void setPlayersCurrentClub(Integer playersCurrentClubID) {
		this.currentTeamID = playersCurrentClubID;
	}
	
	public Double getPlayerValue() {
		return playerValue;
	}
	
	public void setPlayerValue(Double playerValue) {
		this.playerValue = playerValue;
	}
	
	public Double getPlayerWage() {
		return playerWage;
	}
	
	public void setPlayerWage(Double playerWage) {
		this.playerWage = playerWage;
	}
	
	public EPosition getPlayersPosition() {
		return playersPosition;
	}
	
	public void setPlayersPosition(EPosition playersPosition) {
		this.playersPosition = playersPosition;
	}
	
	@Override
	public String toString() {
		return "Player{" + "id=" + getId() + ", playerName='" + getPlayerName() + '\'' + ", playerAge=" + getPlayerAge() + ", playerNationality='" + getPlayerNationality() + '\'' + ", playerOverallRating=" + getPlayerOverallRating() + ", playersCurrentClub=" + getPlayersCurrentClub() + ", playerValue=" + getPlayerValue() + ", playerWage=" + getPlayerWage() + ", playersPosition=" + getPlayersPosition() + '}';
	}
}