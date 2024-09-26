import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
 	Scanner scanner = new Scanner(System.in);
        final int MIN = 1;
        final int MAX = 10;
	int t=1;
	while(t<=3){
        int secretNumber = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
        System.out.print("Enter the number you guess (between " + MIN + " and " + MAX + "): ");
        int userGuess = scanner.nextInt();

        if (userGuess < MIN || userGuess > MAX) {
            System.out.println("Enter the number between the range " + MIN + " and " + MAX + ":");
        } else if (userGuess < secretNumber) {
            System.out.println("The number is too low");
        } else if (userGuess > secretNumber) {
            System.out.println("The number is too high");
        } else {
            System.out.println("You Win!");
        }
	t++;
	}
        scanner.close();
    }
}
