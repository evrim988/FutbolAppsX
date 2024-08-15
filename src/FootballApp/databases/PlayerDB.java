package FootballApp.databases;


import FootballApp.entities.Player;
import FootballApp.entities.Team;
import FootballApp.utility.DatabaseManager;

import java.util.List;
import java.util.Optional;

public class PlayerDB extends DatabaseManager<Player> {
	
	public Optional<Player> findByID(Integer playerID) {
		for (Player player : veriListesi) {
			if (player.getId()==playerID) {
				return Optional.of(player);
			}
		}
		return Optional.empty();
	}
	
	public Optional<Player> findByName(String name) {
		for (Player player : veriListesi) {
			if (player.getName().equals(name)) {
				return Optional.of(player);
			}
		}
		return Optional.empty();
	}

	public List<Player> listAll() {
		return veriListesi;
	}
}