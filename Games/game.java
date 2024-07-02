    
import java.util.Random;
import java.util.Scanner;

public class game { // Guess the number game! You would be guessing a number between 1-5000

    public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(5000) + 1;
        int playerGuess;
        Scanner input = new Scanner(System.in);
        boolean hasWon = false; // if we make this true, the while loop isn't gonna run because the condition is already true.
        // Since it's false the while loop won't stop until hasWon is true

        System.out.println("Welcome to the Number Guesser game!");
        System.out.println("Guess a number between 1 and 5000:");

        while (!hasWon) { // This line starts a while loop that continues until hasWon becomes true, indicating that the player has won the game.
            playerGuess = input.nextInt();
            if (playerGuess == numberToGuess) { // This line checks if the player's guess is equal to the randomly generated number.
                hasWon = true; // This line sets hasWon to true if the player's guess is correct.
                System.out.println("Congratulations! You guessed the number!");
            } else if (playerGuess < numberToGuess) {
                // this line checks if the player's guess is less than the randomly generated number.
                System.out.println("Too low! Guess again:");
            } else {
                // this line executes if the player's guess is too high.
                System.out.println("Too high! Guess again:");
            }
        }
    }
}

