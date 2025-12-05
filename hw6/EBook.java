/**
 * /**
 * Assignment: hw6 
 * Name: Samie Kadirova
 * Email: a.kadirova@tcu.edu
 * Class-Section: CoSc10403
 * 
 * This class represents an EBook with title, author, version number,
 * purchase price, and filename. It has a constructor, getters, setters,
 * and a method to display all the book details.
 */

public class EBook {
    // Private fields for the EBook
    private String title;
    private String author;
    private int versionNumber;
    private double purchasePrice;
    private String filename;
    
    // Constructor to create an EBook with all the required information
    public EBook(String bookTitle, String bookAuthor, int version, double price, String file) {
        title = bookTitle;
        author = bookAuthor;
        versionNumber = version;
        purchasePrice = price;
        filename = file;
    }
    
    // Getter method to get the title
    public String getTitle() {
        return title;
    }
    
    // Setter method to set the title
    public void setTitle(String bookTitle) {
        title = bookTitle;
    }
    
    // Getter method to get the author
    public String getAuthor() {
        return author;
    }
    
    // Setter method to set the author
    public void setAuthor(String bookAuthor) {
        author = bookAuthor;
    }
    
    // Getter method to get the version number
    public int getVersionNumber() {
        return versionNumber;
    }
    
    // Setter method to set the version number
    public void setVersionNumber(int version) {
        versionNumber = version;
    }
    
    // Getter method to get the purchase price
    public double getPurchasePrice() {
        return purchasePrice;
    }
    
    // Setter method to set the purchase price
    public void setPurchasePrice(double price) {
        purchasePrice = price;
    }
    
    // Getter method to get the filename
    public String getFilename() {
        return filename;
    }
    
    // Setter method to set the filename
    public void setFilename(String file) {
        filename = file;
    }
    
    // Method to display all the details of the EBook
    public void displayDetail() {
        System.out.println("EBook Detail: ");
        System.out.println("EBook Title: " + title);
        System.out.println("EBook Author: " + author);
        System.out.println("EBook Version: " + versionNumber);
        System.out.println("EBook Price: " + purchasePrice);
        System.out.println("EBook Location: " + filename);
        System.out.println();
    }
}
