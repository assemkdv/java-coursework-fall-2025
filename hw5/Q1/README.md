/*
 * Assignment: HW 5 Q1
 * Name: Samie Kadirova
 * Email: a.kadirova@tcu.edu
 * Class-Section: CoSc10403
 * 
 * Overview:
 * This program simulates the dice game of Craps. The game follows standard craps rules:
 * - On the first roll (come-out roll):
 *   - If the sum is 7 or 11, the player wins immediately
 *   - If the sum is 2, 3, or 12, the player loses immediately (craps)
 *   - Otherwise, the sum becomes the "point" and the game continues
 * - On subsequent rolls:
 *   - If the player rolls the point again, they win
 *   - If the player rolls a 7, they lose
 *   - Otherwise, they continue rolling
 * 
 * The program allows the user to specify how many games to simulate, then calculates
 * and displays the win rates for both the player and the house.
 */

import java.util.Random;
import java.util.Scanner;

public class craps {

    // Random number generator for dice rolls
    private static Random random = new Random();

    
    // Simulates rolling a single six-sided die
    // return a random integer between 1 and 6 (inclusive)
    private static int rollDice() {
        return random.nextInt(6) + 1;
    }

    
    // Plays a single game of craps according to standard rules
    // return true if the player wins, false if the house wins
    private static boolean playGame() {
        // Roll the dice for the come-out roll
        int die1 = rollDice();
        int die2 = rollDice();
        int sum = die1 + die2;

        // Check for immediate win or loss on come-out roll
        if (sum == 2 || sum == 3 || sum == 12) {
            // Player loses immediately (craps)
            return false;
        }
        else if (sum == 7 || sum == 11) {
            // Player wins immediately (natural)
            return true;
        }
        else {
            // Establish a point - player must roll this number again before rolling a 7
            int point = sum;
            
            // Continue rolling until player wins or loses
            while (true) {
                // Roll the dice again
                die1 = rollDice();
                die2 = rollDice();
                sum = die1 + die2;

                if (sum == point) {
                    // Player rolled the point - they win!
                    return true;
                }
                else if (sum == 7) {
                    // Player rolled a 7 - they lose
                    return false;
                }
                // Otherwise, continue rolling (loop continues)
            }
        }
    }

    
    // Main method that runs the craps simulation
    public static void main(String[] args) {
        // Create Scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for number of games to simulate
        System.out.print("How many times should we play the game? ");
        int trials = scanner.nextInt();

        // Initialize counters for tracking wins
        double playerWins = 0;  // Number of games the player won
        double houseWins = 0;   // Number of games the house won

        // Simulate the specified number of games
        for (int i = 0; i < trials; i++) {
            if (playGame() == true) {
                // Player won this game
                playerWins++;
            }
            else {
                // House won this game
                houseWins++;
            }
        }
        
        // Calculate win percentages
        double playerPercent = (playerWins / trials) * 100;
        double housePercent = (houseWins / trials) * 100;

        // Display the results with formatted percentages (2 decimal places)
        System.out.printf("The player won %d out of %d games (%.2f%% win rate).%n", (int) playerWins, trials, playerPercent);
        System.out.printf("The house won %d out of %d games (%.2f%% win rate).%n", (int) houseWins, trials, housePercent);
    }
}
