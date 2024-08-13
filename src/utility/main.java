package utility;

import entities.BaseEntity;

import java.util.ArrayList;
import java.util.List;

public class main {
	public static void main(String[] args) {
		List<BaseEntity> list=null;
		String a=null;
		
		DatabaseManager databaseManager=new DatabaseManager();
		
		databaseManager.saveAll(list);
		
	}
}