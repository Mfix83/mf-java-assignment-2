package com.coderscampus.java2;

import java.util.Scanner;
import java.util.Random;

public class JavaAssignment2 {

    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(100);
        int maxGuesses = 5;
        int numGuesses = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a number between 1 and 100. You will have 5 guesses!");

        while (numGuesses < maxGuesses) {
            System.out.print("Choose a random number between 1 and 100: ");
            int guess = scanner.nextInt();
            numGuesses++;

            if (guess < 1 || guess > 100) {
                System.out.println("Your guess is not between 1 and 100, please try again.");
                continue;
            }

            if (guess < randomNumber) {
                System.out.println("Please pick a higher number.");
            } else if (guess > randomNumber) {
                System.out.println("Please pick a lower number.");
            } else {
                System.out.println("You win! Game over!");
                scanner.close();
                return; // Game over
            }
        }

        System.out.println("You lose, the number to guess was " + randomNumber);
        scanner.close();
    }

}
