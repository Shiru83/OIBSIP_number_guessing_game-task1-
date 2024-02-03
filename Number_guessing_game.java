import java.util.Random;
import java.util.Scanner;

public class Number_guessing_game {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int min_num = 1;  
        int max_num = 100; //range between 1 to 100
        int generated_Num = random.nextInt(max_num - min_num + 1) + min_num; //generating random number
        int max_Attempts = 8;
        double score = 100; 

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a random number between " + min_num + " to " + max_num + ". Try to guess it.(maximum attempts are 8)");

        for (int attempt = 1; attempt <= max_Attempts; attempt++) {
            System.out.print("Enter your guess (Attempt " + attempt + "/" + max_Attempts + "): ");
            int user_Guess = sc.nextInt();

//comparing user's guess with generated number

            if (user_Guess == generated_Num) {
                System.out.println("Congratulations! You guessed the correct number.");
                System.out.println("Your score: " + score);
                break;
            } else if (user_Guess > generated_Num) {
                System.out.println("Too  high! Try again.");
            } else {
                System.out.println("Too low! Try again.");
            }
            

            score -= 12.5; //per attempts decreasing score by 12.5
            if (attempt == max_Attempts)  //checking the maximum attempts are over or not
             {
                System.out.println("Sorry, you've run out of attempts. The correct number was: " + generated_Num);
                System.out.println("your score is 0");
            }
        }

        sc.close();
    }
}


