package FootballApp.entities;

public class Person extends BaseEntity {
	private static Integer personCounter=0;
	
	private String personName;
	private Integer personAge;
	private String personNationality;
	
	
	public Person(Integer id) {
		super(++personCounter);
	}
	
	public Person(Integer id,String name, Integer age, String nationality) {
		super(++personCounter);
		this.personName = name;
		this.personAge = age;
		this.personNationality = nationality;
	}
	
	
	public String getName() {
		return personName;
	}
	
	public void setName(String name) {
		this.personName = name;
	}
	
	public Integer getAge() {
		return personAge;
	}
	
	public void setAge(int age) {
		this.personAge = age;
	}
	
	public String getNationality() {
		return personNationality;
	}
	
	public void setNationality(String nationality) {
		this.personNationality = nationality;
	}
	
}