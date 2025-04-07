package ie.atu.sw;

public class RecursiveGuessingGame {
	
	public void guess(int number, int min, int max) {
		int guess = (int) (min + max) / 2;
		
		if (guess == number) {
			System.out.println("Guessed " + guess + " correctly.");
			return;
		}else if (guess > number) {
			System.out.println("Guessed too high " + guess);
			max = guess - 1;
		}else {
			System.out.println("Guessed too low " + guess);
			min = guess + 1;
		}
	}

	public static void main(String[] args) {
		RecursiveGuessingGame rgg = new RecursiveGuessingGame();
		int number = 767;
		rgg.guess(number, 0, 1_000_000);
	}
}
