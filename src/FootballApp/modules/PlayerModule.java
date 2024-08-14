package FootballApp.modules;

import FootballApp.databases.PlayerDB;
import FootballApp.entities.Player;
import FootballApp.enums.EPosition;

import java.util.List;
import java.util.Random;

public class PlayerModule {
	static Random rand = new Random();
	static PlayerDB playerDB=new PlayerDB();
	
	public void playerGenerator(){
		List<String> names=List.of("Ali","Ahmet","Baris","Ceren","Deniz","Kemal");
		EPosition[] positions = EPosition.values();
		
		
		for (int i = 0; i < 11; i++) {
			Integer age = rand.nextInt(15,35);
			Integer teamID = rand.nextInt(1, 21);
			Double value = rand.nextDouble(100_000, 5_000_000);
			Double wage = rand.nextDouble(5_000, 8_000);
			Integer positionIndex = rand.nextInt(0, 4);
			String name=names.get(rand.nextInt(names.size()));
			EPosition position=positions[positionIndex];
			
			playerDB.save(new Player(name,age,"Turkiye",null,1,wage,value,position));
		}
		
	}
}