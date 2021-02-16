// Import required java packages
import java.util.*;

// Create GuessGame class
public class GuessGame {
    public static void main(String[] args) {
        // Calling guessGame method
        guessGame();
    }

    // Declare guessGame method
    public static void guessGame() {

        // Create three int variables(guess, number, and count)
        int guess = 0;
        int number = 0;
        int count = 1;

        // Calling getRandomInteger method with two parameters(max, min)
        number = getRandomInteger(100, 1);

        // Using for loop to loop through number
        for (int i = 0; i < number; i++) {

            // Asking user for guess number and store in guess variable
            System.out.println("Enter your guess");
            Scanner sa = new Scanner(System.in);
            guess = sa.nextInt();

            // Using if/else statement to check if user guess the correct number and print
            // appropriate message and number of guesses user take to guess the correct
            // number
            if (guess == number) {
                System.out.println("No of guess: " + count);
                break;
            } else {
                // if guess is more than number
                if (guess > number) {
                    System.out.println("Too high, try again");
                }
                // if guess is less than number
                else if (guess < number) {
                    System.out.println("Too low, try again");
                }
            }
            count++;
        }

    }

    // Declare getRandomIngeter method with two parameters (maximum, minimum) and
    // return random number
    public static int getRandomInteger(int maximum, int minimum) {
        return ((int) (Math.random() * (maximum - minimum))) + minimum;
    }
}