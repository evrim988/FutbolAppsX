package entities;

import entities.attributes.TechnicalAttributes;
import enums.EPosition;

public class Player extends Person {
	private static Integer playerCounter=0;
	
	private Integer playerOverallRating;
	private Integer currentTeamID;
	private Double playerValue;
	private Double playerWage;
	private EPosition playersPosition;
	private Integer technicalAttributesID;
	
	public Player() {
		super(++playerCounter);
	}
	
	public Player(String name, Integer age, String nationality,Integer technicalAttributesID,
	              Integer teamID, Double playerValue, Double playerWage, EPosition EplayersPosition) {
		super(++playerCounter,name,age,nationality);
//		this.playerOverallRating = playerOverallRating(technicalAttributesID);
		this.currentTeamID=teamID;
		this.playerValue = playerValue;
		this.playerWage = playerWage;
		this.playersPosition = EplayersPosition;
	}
	
	private Integer playerOverallRating(TechnicalAttributes tec) {
		this.playerOverallRating = (tec.getDribbling()+ tec.getFinishing()+tec.getPass()+tec.getTackle()
				+tec.getShotPower())/5;
		return playerOverallRating;
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
		return "Player{" + "id=" + getId() + ", name='" + getName() + '\'' + ", age=" + getAge() + ", nationality='" + getNationality() + '\'' + ", playerOverallRating=" + getPlayerOverallRating() + ", currentTeamID=" + currentTeamID + ", playerValue=" + getPlayerValue() + ", playerWage=" + getPlayerWage() + ", playersPosition=" + getPlayersPosition() + ", technicalAttributesID=" + technicalAttributesID + '}';
	}
}