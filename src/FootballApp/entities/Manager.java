package FootballApp.entities;

public class Manager extends Person {
	private static Integer managerCounter=0;
	
	private String managerUserName;
	private String managerPassword;
	
	public Manager() {
		super(++managerCounter);
	}
	
	public Manager(String name, Integer age, String nationality, String managerUserName, String managerPassword) {
		super(++managerCounter, name, age, nationality);
		this.managerUserName = managerUserName;
		this.managerPassword = managerPassword;
	}
}