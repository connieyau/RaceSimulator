package model;

import java.util.*;

public class Track {
	private boolean m_hasWinner;
	private boolean m_isRaceStarted;
	private Runner[][] m_raceTrack;
	
	private final Random m_random;
	private final ArrayList<Runner> m_runners;

	public Track() {
		m_runners = new ArrayList<Runner>();
		m_random = new Random();
	}

	public boolean addRunner(Runner runner) {
		if (m_isRaceStarted)
			return false;
		
		return m_runners.add(runner);
	}
	
	public void startRace() throws Exception {
		if (m_runners.isEmpty())
			throw new Exception("Cannot start race with no runners.");
		
		m_isRaceStarted = true;
		int column = m_runners.size();
		m_raceTrack = new Runner[50][column];
	}

	public boolean getHasWinner() {
		return m_hasWinner;
	}
	
	public boolean 
}
