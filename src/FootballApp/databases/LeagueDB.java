package FootballApp.databases;

import FootballApp.entities.League;
import FootballApp.entities.Team;
import FootballApp.utility.DatabaseManager;

import java.util.Optional;

public class LeagueDB extends DatabaseManager<League> {
	public Optional<League> findByID(Integer leagueID) {
		for (League league : veriListesi) {
			if (league.getId()==leagueID) {
				return java.util.Optional.of(league);
			}
		}
		return java.util.Optional.empty();
	}
	
	public Optional<League> findByName(String leagueName) {
		for (League league : veriListesi) {
			if (league.getLeagueName().equals(leagueName)) {
				return java.util.Optional.of(league);
			}
		}
		return java.util.Optional.empty();
	}
}