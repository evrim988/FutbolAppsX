package FootballApp.databases;

import FootballApp.entities.Fixture;
import FootballApp.entities.Match;
import FootballApp.utility.DatabaseManager;

import java.util.Optional;

public class MatchDB extends DatabaseManager<Match> {
	
	public Optional<Match> findByID(Integer matchID) {
		for (Match match : veriListesi) {
			if (match.getId() == matchID) {
				return Optional.of(match);
			}
		}
		return Optional.empty();
	}
}