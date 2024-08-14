package FootballApp.entities;

public class Manager extends Person {
	private static Integer managerCounter=0;
	
	private String managerUserName;
	private String managerPassword;
	private Integer currentTeamID;
	
	public Manager() {
		super(++managerCounter);
	}
	
	public Manager(String name, Integer age, String nationality, String managerUserName, String managerPassword, Integer currentTeamID) {
		super(++managerCounter, name, age, nationality);
		this.managerUserName = managerUserName;
		this.managerPassword = managerPassword;
		this.currentTeamID = currentTeamID;
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
}