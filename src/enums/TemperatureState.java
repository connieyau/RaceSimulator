package enums;

public enum TemperatureState {
	average {
		public String toString() { return "Average"; }
	},
	hot {
		public String toString() { return "Hot"; }
	},
	veryhot {
		public String toString() { return "Very Hot"; }
	},
	heatwave {
		public String toString() { return "Heavy Wave"; }
	}
}
