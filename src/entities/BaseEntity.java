package entities;

public class BaseEntity {
	protected final  int id;
	
	public BaseEntity(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
}