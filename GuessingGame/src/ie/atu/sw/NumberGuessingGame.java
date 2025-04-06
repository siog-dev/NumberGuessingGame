package ie.atu.sw;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

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
		
		//Random rand = new Random(); //option 2
		ThreadLocalRandom random = ThreadLocalRandom.current(); //option 3
		
		//number = (int)(Math.random() * 100); //option 1: Simple, error prone
		//number = rand.nextInt(1, 101); //option 2: Much better
		number = random.nextInt(1, 101); //option 3: The best - most "random"
		
		boolean notGuessed = true;
		int counter = 0;
		
		//FOR LOOP
		for (int i = 0; i < MAX_GUESSES && notGuessed; i++) {
			
			out.println("Guess a number between 1 and 100");
			
			int guess = Integer.parseInt(s.next());
			
			if (guess == number) {
				out.println("Correct! Well done :)");
				notGuessed = false;
			}else if (guess > number) {
				out.println("Too high!");
			}else {
				out.println("Too low!");
			}
			
			counter++;
			out.println("You have " + (MAX_GUESSES - counter) + " tries left.");
			
			}
		
		if (notGuessed) {
			out.println("Too bad. The correct answer was " + number);
			
		}
		
		//DO LOOP
		/*
		do {
			out.println("Guess a number between 1 and 100>");
			
			int guess = Integer.parseInt(s.next());
			
			if (guess == number) {
				out.println("Correct! Well done :)");
				notGuessed = false;
			}else if (guess > number) {
				out.println("Too high!");
			}else {
				out.println("Too low!");
			}
			counter++;
			out.println("You have " + (MAX_GUESSES - counter) + " tries left.");
		} while (counter < MAX_GUESSES && notGuessed);

		if (notGuessed) {
			out.println("Too bad. The correct answer was " + number);
		}
		*/
		
		//WHILE LOOP
		/*
		while (counter < MAX_GUESSES && notGuessed) {
			out.println("Guess a number between 1 and 100>");
			
			int guess = Integer.parseInt(s.next());
			
			if (guess == number) {
				out.println("Correct! Well done :)");
				notGuessed = false;
			}else if (guess > number) {
				out.println("Too high!");
			}else {
				out.println("Too low!");
			}
			
			counter++;
			out.println("You have " + (MAX_GUESSES - counter) + " tries left.");
		}
		
		if (notGuessed) {
			out.println("Too bad. The correct answer was " + number);
		}
		*/
	}
	
}
