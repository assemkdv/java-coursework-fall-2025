/**
 * Lab #10
 * Name: Samie Kadirova
 * Email: a.kadirova@tcu.edu
 * Class-Section: CoSc10403
 * 
 * This class creates a Library book system with static methods for library info
 * and instance methods for each book's details.
 */

public class Library {
    // Static variables that all books share
    private static double fineRate = 0.50;
    private static String openingHours = "9:00 AM to 5:00 PM";
    
    // Instance variables for each book
    private String title;
    private String author;
    private int year;
    private boolean isBorrowed;
    
    // Constructor to make a new book
    public Library(String bookTitle, String bookAuthor, int publicationYear) {
        title = bookTitle;
        author = bookAuthor;
        year = publicationYear;
        isBorrowed = false;
    }
    
    // Static method to show opening hours
    public static void displayOpeningHours() {
        System.out.println("Library Opening Hours: " + openingHours);
    }
    
    // Static method to calculate fine
    public static double calculateFine(int overdueDays) {
        return overdueDays * fineRate;
    }
    
    // Method to show book info
    public void displayBookDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Year: " + year);
        if (isBorrowed) {
            System.out.println("Borrowed: Yes");
        } else {
            System.out.println("Borrowed: No");
        }
    }
    
    // Method to check out a book
    public void checkOutBook() {
        if (isBorrowed) {
            System.out.println(title + " is already borrowed.");
        } else {
            isBorrowed = true;
            System.out.println(title + " has been checked out.");
        }
    }
    
    // Method to return a book
    public void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " was not borrowed.");
        }
    }
}

