/*
Assignment: Lab 5
Name: Samie Kadirova
Email: a.kadirova@tcu.edu
Class-Section: CoSc10403
Overview:
Computes the amount of a raise and the new salary for an employee.
The current salary and a performance rating (a String: "Excellent", "Good" or "Poor") are input.
Added additional features:
- The program now reads the first character of the user's input for performance rating,
allowing it to accept both uppercase and lowercase letters.
- Implemented a do-while loop to ask the user if they would like to calculate another salary.
If the user enters "yes", the program runs again; if "no", the program ends.
*/

import java.util.Scanner;
public class Salary {
    public static void main(String[] args) {
        double currentSalary;  // Employee's current salary
        double raise;    // Amount of the raise
        double newSalary;      // New salary for the employee after raise
        String rating;         // Performance rating
        char firstCharacter; // To read the first character of the String
        String yesOrNo;

        // TODO: Create a scanner object to take user input
        Scanner scan = new Scanner(System.in);
        do 
        {
        // Prompt the user to enter the current salary
        System.out.print("Enter the current salary: ");
        currentSalary = scan.nextDouble();  // Read the salary input from the user

        // TODO: Loop to ensure a valid (non-negative) salary is entered
        while (currentSalary < 0) {
            System.out.print("Error: Salary cannot be negative. Please reenter: ");
            currentSalary = scan.nextDouble();
        }
        // Consume the newline character left in the buffer from the previous input
        scan.nextLine();

        // Prompt the user to enter their performance rating (Excellent, Good, or Poor)
        System.out.print("Enter the performance rating (Excellent, Good, or Poor): ");
        rating = scan.nextLine();  // Read the rating input from the user
        firstCharacter = rating.charAt(0);

        // TODO: Determine the raise percentage based on the rating using if...else statements
        if (firstCharacter == 'E' || firstCharacter == 'e') {
            raise = currentSalary * 0.06;
        }
        else if (firstCharacter == 'G' || firstCharacter == 'g') {
            raise = currentSalary * 0.04;
        }
        else if (firstCharacter == 'P' || firstCharacter == 'p') {
            raise = currentSalary * 0.015;
        }
        else {
            System.out.println("Error: Invalid performance rating.");
            break;
        }

        // TODO: Calculate the new salary by adding the raise to the current salary
        newSalary = currentSalary + raise;


        // TODO: Display the results to the user, currentSalary, raise, newSalary, use println statements
        System.out.println("Current salary: $" + currentSalary);
        System.out.println("Amount of your raise: $" + raise);
        System.out.println("Your new salary: $" + newSalary);

        System.out.println("Would you like to perform another salary calculation? ");
        yesOrNo = scan.nextLine();
        firstCharacter = yesOrNo.charAt(0);
    } while (firstCharacter == 'Y' || firstCharacter == 'y');
}
}