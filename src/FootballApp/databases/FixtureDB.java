package FootballApp.databases;

import FootballApp.entities.Fixture;
import FootballApp.entities.Player;
import FootballApp.utility.DatabaseManager;

import java.util.Optional;

public class FixtureDB extends DatabaseManager<Fixture> {
	
	public Optional<Fixture> findByID(Integer fixtureID) {
		for (Fixture fixture : veriListesi) {
			if (fixture.getId() == fixtureID) {
				return Optional.of(fixture);
			}
		}
		return Optional.empty();
	}
	
}