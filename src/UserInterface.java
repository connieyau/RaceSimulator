import java.io.*;

import model.Track;

public class UserInterface {
	private final Track m_track;
	
	public UserInterface() {
		m_track = new Track();
	}
	
	public void start() {
		while (!m_track.getHasWinner())
			printMenu();
	}

	private void printMenu() {
		System.out.println("----- MAIN MENU -----");
		System.out.println("Type the letter corresponding to a command to invoke it.");
		System.out.println("\t(J)og");
		System.out.println("\t(R)un");
		System.out.println("\t(S)print");
		System.out.println("\t(Q)uit Simulation");
		getUserInput();
	}
	
	private void getUserInput() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		boolean isValid = false;
		
		while (!isValid) {
			System.out.print("Enter a command: ");
			String userInput = "";
			try {
				userInput = reader.readLine();
			} catch (IOException ex) {
				System.err.println("Error reading input.");
			}
			isValid = true;
			userInput = userInput.toLowerCase().trim();
			if (userInput.compareTo("q") == 0)
				exit();
			else if (userInput.compareTo("j") == 0)
				m_track.;
			else if (userInput.compareTo("s") == 0)
				searchMovie();
			else if (userInput.compareTo("q") == 0)
				displayMovies();
			else
			{
				System.out.println("Please enter a valid option.");
				isValid = false;
			}
		}
	}

	// Exits the program.
	private void exit() {
		System.out.println("Exiting program. Goodbye.");
		System.exit(0);
	}
}
