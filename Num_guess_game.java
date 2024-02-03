import java.util.Random;
import java.util.Scanner;
public class Num_guess_game {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int min_num = 1;
        int max_num = 100;
        int generated_Num = random.nextInt(max_num - min_num + 1) + min_num;
        int maxAttempts = 5;
        int score = 100; // Initial score

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between " + min_num + " and " + max_num + ". Try to guess it.");

        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.print("Enter your guess (Attempt " + attempt + "/" + maxAttempts + "): ");
            int userGuess = scanner.nextInt();

            if (userGuess == generated_Num) {
                System.out.println("Congratulations! You guessed the correct number.");
                System.out.println("Your score: " + score);
                break;
            } else if (userGuess < generated_Num) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }

            // Update score based on the number of attempts
            score -= 20;

            // Display hints if it's the last attempt
            if (attempt == maxAttempts) {
                System.out.println("Sorry, you've run out of attempts. The correct number was: " + generated_Num);
            }
        }

        scanner.close();
    }
}


