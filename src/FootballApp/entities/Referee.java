package FootballApp.entities;

public class Referee extends Person {
	private static Integer refereeCounter=0;
	
	public Referee() {
		super(++refereeCounter);
	}
	
	public Referee(String name, String surName, Integer age, String nationality) {
		super(++refereeCounter, name, surName, age, nationality);
	}
	
	@Override
	public String toString() {
		return "Referee{" + "id=" + getId() + ", name='" + getName() + '\'' + ", age=" + getAge() + ", nationality='" + getNationality() + '\'' + '}';
	}
}