package FootballApp.databases;


import FootballApp.entities.StandingTable;
import FootballApp.utility.DatabaseManager;

import java.util.Optional;

public class StandingTableDB extends DatabaseManager<StandingTable> {
	
	public Optional<StandingTable> findByID(Integer standingTableID) {
		for (StandingTable st : veriListesi) {
			if (st.getId()==standingTableID) {
				return Optional.of(st);
			}
		}
		return Optional.empty();
	}
}