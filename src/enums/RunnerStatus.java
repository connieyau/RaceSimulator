package enums;

public enum RunnerStatus {
	normal { 
		public String toString() { return "Normal"; }
	},
	winded {
		public String toString() { return "Winded"; }
	},
	burntout {
		public String toString() { return "Burnt Out"; }
	}
}
