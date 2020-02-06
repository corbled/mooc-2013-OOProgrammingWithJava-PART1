
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!
        guess(numberDrawn, reader);
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }

    public static void guess(int numberDrawn, Scanner reader) {
        int guess, numGuesses = 0;

        while (true) {
            System.out.print("Guess a number: ");
            guess = Integer.parseInt(reader.nextLine());
            numGuesses ++;

            if (guess > numberDrawn) {
                System.out.println("The number is lesser, guesses made: " + numGuesses);
            } else if (guess <  numberDrawn) {
                System.out.println("The number is greater, guesses made: " + numGuesses);
            } else {
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
        }
    }
}
