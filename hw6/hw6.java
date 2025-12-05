/**
 * Assignment: hw6 
 * Name: Samie Kadirova
 * Email: a.kadirova@tcu.edu
 * Class-Section: CoSc10403
 * 
 * This is a simple EBook Library application. It lets users view book details
 * and update book prices. The program uses a menu system with options to
 * view books, update prices, or exit.
 */

import java.util.Scanner;

public class hw6 {
    // Constant for how many books we have
    private static final int NUM_EBOOKS = 5;
    
    // Scanner for getting user input
    private static Scanner scanner = new Scanner(System.in);
    
    // Main method that runs the program
    public static void main(String[] args) {
        System.out.println("A Simple EBook Library Application");
        System.out.println();
        
        // Create an array to hold the books
        EBook[] library = new EBook[NUM_EBOOKS];
        
        // Fill the array with books
        populateEBooks(library);
        
        // Keep showing the menu until user enters -1
        int choice;
        do {
            displayMainMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear the newline
            
            if (choice == 1) {
                // User wants to view book details
                viewEBookDetails(library);
            } else if (choice == 2) {
                // User wants to update a book price
                updateEBookPrice(library);
            } else if (choice == -1) {
                // User wants to exit
                System.out.println("bye!");
            }
            // If choice is something else, just show menu again
        } while (choice != -1);
        
        scanner.close();
    }
    
    // Method to fill the library array with 5 books
    public static void populateEBooks(EBook[] library) {
        library[0] = new EBook("beginning java", "Ivor Horton", 1, 45.99, "/books/BeginningJava.pdf");
        library[1] = new EBook("Learning Java", "Marc Loy", 6, 29.99, "/books/LearningJava.pdf");
        library[2] = new EBook("Head First Java", "Kathy Sierra", 3, 69.99, "/books/HeadFirstJava.pdf");
        library[3] = new EBook("Java in a Nutshell", "Benjamin J. Evans", 7, 54.99, "/books/JavaInANutshell.pdf");
        library[4] = new EBook("Effective Java", "Joshua Bloch", 3, 18.38, "/books/EffectiveJava.pdf");
    }
    
    // Method to show the main menu options
    public static void displayMainMenu() {
        System.out.println("Enter 1 to view book details");
        System.out.println("Enter 2 to update a book's price");
        System.out.println("Enter -1 to exit");
    }
    
    // Method to show the list of books with numbers
    public static void displayEBookList(EBook[] library) {
        System.out.println("=== Your EBook Library ===");
        for (int i = 0; i < library.length; i++) {
            System.out.println((i + 1) + ". " + library[i].getTitle());
        }
    }
    
    // Method to handle viewing book details
    public static void viewEBookDetails(EBook[] library) {
        int choice;
        do {
            // Show the list of books
            displayEBookList(library);
            System.out.println("Please select a number to display a book.");
            System.out.println("or enter -1 to exit view details");
            
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear the newline
            
            // Check if the choice is valid
            if (choice >= 1 && choice <= NUM_EBOOKS) {
                // Show the book details
                library[choice - 1].displayDetail();
            }
            // If choice is not valid and not -1, just show menu again
        } while (choice != -1);
    }
    
    // Method to handle updating a book's price
    public static void updateEBookPrice(EBook[] library) {
        int choice;
        do {
            // Show the list of books
            displayEBookList(library);
            System.out.println("Please select a number to edit its price.");
            System.out.println("or enter -1 to exit update price");
            
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear the newline
            
            // Check if the choice is valid
            if (choice >= 1 && choice <= NUM_EBOOKS) {
                // Show current book details
                library[choice - 1].displayDetail();
                
                // Ask for new price
                System.out.println("Please enter a new price for the book");
                double newPrice = scanner.nextDouble();
                scanner.nextLine(); // Clear the newline
                
                // Update the price
                library[choice - 1].setPurchasePrice(newPrice);
                
                // Show updated details
                System.out.println("Updated book detail");
                library[choice - 1].displayDetail();
            }
            // If choice is not valid and not -1, just show menu again
        } while (choice != -1);
    }
}