/**
 * Lab #10
 * Name: Samie Kadirova
 * Email: a.kadirova@tcu.edu
 * Class-Section: CoSc10403
 * 
 * This is the main test file for the Library class.
 */

public class LibrarySystems {
    public static void main(String[] args) {
        // Test static methods
        Library.displayOpeningHours();
        System.out.println("Fine for 5 overdue days: $" + Library.calculateFine(5));
        System.out.println();
        
        // Create two books
        Library book1 = new Library("To Kill a Mockingbird", "Harper Lee", 1960);
        Library book2 = new Library("1984", "George Orwell", 1949);
        
        // Show book details
        book1.displayBookDetails();
        book2.displayBookDetails();
        System.out.println();
        
        // Test checking out books
        book1.checkOutBook();
        book1.checkOutBook();
        System.out.println();
        
        // Test returning books
        book1.returnBook();
        book1.returnBook();
    }
}
