import java.util.Scanner;
import java.util.Random;

public class NumberGuessing{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int numberOfTries = 0;
		int userGuess;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I've selected a random number between 1 and 100. Try to guess it.");

        while (true) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            numberOfTries++;

            if (userGuess < numberToGuess) {
                System.out.println("Try a higher number.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Try a lower number.");
            } else {
                System.out.println("Congratulations! You guessed the number " + numberToGuess + " in " + numberOfTries + " tries.");
                break;
            }
        }

        scanner.close();
    }
}
