package enums;

public enum RunningMode {
	walk { 
		public String toString() { return "Walk"; }
	},
	jog {
		public String toString() { return "Jog"; }
	},
	sprint {
		public String toString() { return "Sprint"; }
	},
}
