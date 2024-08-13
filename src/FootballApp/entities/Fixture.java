package FootballApp.entities;

import FootballApp.enums.EMatchStatus;

import java.time.LocalDate;
import java.time.LocalTime;

public class Fixture extends BaseGame{
	private static Integer fixtureCounter=0;
	
	
	public Fixture() {
		super(++fixtureCounter);
	}
	
	public Fixture(Integer leagueID, Integer homeTeamID,
	               Integer awayTeamID, EMatchStatus matchStatus, LocalDate gameDate, LocalTime startTime) {
		
		super(++fixtureCounter, leagueID, homeTeamID, awayTeamID, matchStatus, gameDate, startTime);
	}
	
}