package FootballApp.databases;

import FootballApp.entities.Manager;
import FootballApp.entities.Player;
import FootballApp.entities.Team;
import FootballApp.utility.DatabaseManager;

import java.util.List;
import java.util.Optional;

public class ManagerDB extends DatabaseManager<Manager> {
	
	public Optional<Manager> findByID(Integer managerID) {
		for (Manager manager : veriListesi) {
			if (manager.getId()==managerID) {
				return Optional.of(manager);
			}
		}
		return Optional.empty();
	}
	
	public Optional<Manager> findByName(String name) {
		for (Manager manager : veriListesi) {
			if (manager.getName().equals(name)) {
				return Optional.of(manager);
			}
		}
		return Optional.empty();
	}
	
	public List<Manager> listAll() {
		return veriListesi;
	}
}