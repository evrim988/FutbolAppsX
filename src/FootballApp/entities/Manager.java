package FootballApp.entities;

public class Manager extends Person {
	private static Integer managerCounter=0;
	
	private String managerUserName;
	private String managerPassword;
	private Integer currentTeamID;
	
	public Manager() {
		super(++managerCounter);
		this.currentTeamID=-1; //takim yoksa -1
	}
	
	public Manager(String name, String surName, Integer age, String nationality, String managerUserName, String managerPassword) {
		super(++managerCounter, name, surName, age, nationality);
		this.managerUserName = managerUserName;
		this.managerPassword = managerPassword;
		this.currentTeamID=-1;
	}
	
	public String getManagerUserName() {
		return managerUserName;
	}
	
	public void setManagerUserName(String managerUserName) {
		this.managerUserName = managerUserName;
	}
	
	public String getManagerPassword() {
		return managerPassword;
	}
	
	public void setManagerPassword(String managerPassword) {
		this.managerPassword = managerPassword;
	}
	
	public Integer getCurrentTeamID() {
		return currentTeamID;
	}
	
	public void setCurrentTeamID(Integer currentTeamID) {
		this.currentTeamID = currentTeamID;
	}
	
	@Override
	public String toString() {
		return "Manager{" + "id=" + getId() + ", name='" + getName() + '\'' + ", age=" + getAge() + ", nationality='" + getNationality() + '\'' + ", managerUserName='" + getManagerUserName() + '\'' + ", managerPassword='" + getManagerPassword() + '\'' + ", currentTeamID=" + getCurrentTeamID() + '}';
	}
}