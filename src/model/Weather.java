package model;
import enums.*;

public class Weather {
	private WindStrength m_windStrength;
	private TemperatureState m_temperature;

	public WindStrength getWindStrength(){
		return m_windStrength;
	}
	public void setWindStrength(WindStrength strength) {
		m_windStrength = strength;
	}
	
	public TemperatureState getTemperature() {
		return m_temperature;
	}
	public void setTemperature(TemperatureState temperature) {
		m_temperature = temperature;
	}
}
