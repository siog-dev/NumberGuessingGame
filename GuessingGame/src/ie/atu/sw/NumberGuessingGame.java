package ie.atu.sw;

import java.util.Scanner;
import static java.lang.System.*;

public class NumberGuessingGame {
	private static final int MAX_GUESSES = 12;
	private Scanner s;
	private int number;
	
	public NumberGuessingGame() {
		s = new Scanner(System.in);
	}
	
	public void start() {
		out.println("******************************");
		out.println("**   Number Guessing Game   **");
		out.println("******************************");
	}
	
}
