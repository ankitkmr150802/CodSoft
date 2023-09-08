package CodeSoft;

//Ankit kumar (ID:CS07WX33008)
//Batch: 10th aug 2023- 10th sep 2023
// task-1 [NUMBER GAME] {Codesoft}

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minRange = 1;
        int maxRange = 100;
        int attempts = 10;
        int rounds = 0;
        int score = 0;

        System.out.println(" *** Welcome to the Number Guessing Game !!!!");
        System.out.println("Guess the number between " + minRange + " and " + maxRange);

        boolean playAgain = true;

        while (playAgain) {
            int numberToGuess = random.nextInt(maxRange - minRange + 1) + minRange;
            int currentAttempts = 0;
            boolean hasGuessedCorrectly = false;

            System.out.println("Round " + (rounds + 1));

            while (currentAttempts < attempts) {
                System.out.print("Enter your guess (Attempts left: " + (attempts - currentAttempts) + "): ");
                int userGuess = scanner.nextInt();
                currentAttempts++;

                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations!! You've guessed the correct number.");
                    hasGuessedCorrectly = true;
                    score++;
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Your guess is too low. Try again.");
                } else {
                    System.out.println("Your guess is too high. Try again.");
                }
            }

            if (!hasGuessedCorrectly) {
                System.out.println("Sorry, better luck next time The correct number was " + numberToGuess);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainResponse = scanner.next().toLowerCase();

            if (!playAgainResponse.equals("yes")) {
                playAgain = false;
            }

            rounds++;
        }

        System.out.println("Game over Good luck!!");
        System.out.println("Your total score is: " + score + " out of " + rounds);

        scanner.close();
    }
}

