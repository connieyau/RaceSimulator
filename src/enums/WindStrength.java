package enums;

public enum WindStrength {
	no { 
		public String toString() { return "No Wind"; }
	},
	mild { 
		public String toString() { return "Mild Wind"; }
	},
	heavy { 
		public String toString() { return "Heavy Wind"; }
	}
}
