/*
Assignment: HW 4, Q3
Name: Samie Kadirova
Email: a.kadirova@tcu.edu
Class-Section: CoSc10403
Overview:
This program calculates gross pay based on the number of hours worked and the hourly rate.
It prompts the user to enter hours and rate per hour, then calls the method paycalculator()
to compute the total pay. Hours up to 40 are paid at the normal rate, and any hours above
40 are paid at double the hourly rate. The program then prints the calculated gross pay.
*/
import java.util.Scanner; // Import Scanner class to read user input
public class PayCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Create a Scanner object to read user input
        System.out.println("Enter hours worked: ");
        int hours = scan.nextInt(); // Read the number of hours worked
        System.out.println("Enter rate per hour: ");
        int ratePerHour = scan.nextInt(); // Read the hourly rate
        System.out.println(paycalculator(hours, ratePerHour)); // Calls the methods paycalculator to calculate the gross pay and print the result
    } 
    // Method to calculate gross pay based on hours worked and hourly rate
    public static String paycalculator(int hours, int ratePerHour) {
        int grossPay = 0; // Initialize gross pay
        // If hours are 40 or less, pay is calculated at the normal hourly rate
        if (hours <= 40) {  
        grossPay = hours * ratePerHour;
        }
        // If hours exceed 40, the first 40 hours are paid at normal rate
        // Any hours above 40 are paid at double the hourly rate
        if (hours > 40) {
        grossPay = (40 * ratePerHour) + ((hours - 40) * (ratePerHour * 2));
        }
        // Return the gross pay as a formatted string
        return "The total gross pay is: $" + grossPay + ".00";
    }
}
