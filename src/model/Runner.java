package model;

import enums.*;

public class Runner {
	public final static char PLAYER = 'P';
	public final static char COMPUTER = 'C';
	
	private RunningMode m_mode;
	private RunnerStatus m_status;
	private char m_appearance;
	private Tuple<Integer> m_location;
	
	// This denotes the specific step in the race track.
	// The max length for this is 50. 49 when starting from 
	// zero-index.
	public Integer getRow() {
		return m_location.getFirst();
	}
	public void setRow(int row) {
		m_location.setFirst(row);
	}
	
	// This denotes the track that they are on.
	// Either the first track or the second track.
	// Will be either 0 or 1 in a zero-index array.
	public Integer getColumn() {
		return m_location.getSecond();
	}
	public void setColumn(int column) {
		m_location.setSecond(column);
	}
	
	public RunningMode getMode() {
		return m_mode;
	}
	public void setMode(RunningMode mode) {
		m_mode = mode;
	}
	
	public RunnerStatus getStatus() {
		return m_status;
	}
	public void setStatus(RunnerStatus status) {
		m_status = status;
	}
	
	public char getAppearance() {
		return m_appearance;
	}
	public void setAppearance(char appearance) {
		m_appearance = appearance;
	}
}
