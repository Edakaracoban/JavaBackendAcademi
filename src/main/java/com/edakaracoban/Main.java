package com.edakaracoban;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> guesses = new ArrayList<>();
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("You have 5 attempts to guess the number correctly.");

        int rnd = (int)(Math.random() * 100) + 1;
        int guess = 0;
        int attempts = 0;
        final int MAX_ATTEMPTS = 5;

        while (attempts < MAX_ATTEMPTS) {
            System.out.print("Guess a number between 1 and 100: ");
            try {
                guess = scanner.nextInt();
                if (guess < 1 || guess > 100) {
                    System.out.println("Please enter a number between 1 and 100.");
                    continue;
                }

                guesses.add(guess);
                attempts++;

                if (guess == rnd) {
                    System.out.println("Congratulations! You guessed correctly.");
                    System.out.println("You found the number in " + attempts + " attempts.");
                    break;
                } else if (guess < rnd) {
                    System.out.println("Try a higher number.");
                } else {
                    System.out.println("Try a lower number.");
                }

                if (attempts == MAX_ATTEMPTS) {
                    System.out.println("You've used all your attempts.");
                    System.out.println("The correct number was: " + rnd);
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter an integer number.");
                scanner.next(); // hatalı girişi temizle
            }
        }

        System.out.println("\nGame over.");
        scanner.close();
    }
}
