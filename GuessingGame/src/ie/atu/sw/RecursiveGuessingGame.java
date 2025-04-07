package ie.atu.sw;

public class RecursiveGuessingGame {
	
	public void guess(int number, int min, int max) {
		
	}

	public static void main(String[] args) {
		RecursiveGuessingGame rgg = new RecursiveGuessingGame();
		int number = 767;
		rgg.guess(number, 0, 1_000_000);
	}
}
