# Library System – Static vs. Instance Members

This project implements a simple **Library** system to practice using **static** and **non-static (instance)** attributes and methods in Java.  
Static members store information shared by the entire library (like opening hours and fine rates), while instance members store details about individual books (title, author, year, borrowed status).

The program is tested using the provided `LibrarySystem.java` file, which interacts with the `Library` class.

---

## Overview

The goal of this lab is to:

- Understand the difference between **class-level (static)** and **object-level (instance)** data.
- Implement static attributes/methods that apply to *all* books in the library.
- Implement instance attributes/methods that apply to *each individual* book.
- Use methods to display information, update state, and calculate fines.

`LibrarySystem.java` is the driver file that:
- Sets opening hours and fine rate (via static members).
- Creates `Library` objects representing books.
- Calls methods to check out and return books.
- Demonstrates how static and instance members interact.

---

## Class Design — `Library.java`

### Static (Class-Level) Members

**Private Static Attributes**
- `fineRate` – A `double` representing the fine rate for overdue books  
  *(e.g., 0.50 dollars per day)*.
- `openingHours` – A `String` representing the library’s opening hours  
  *(e.g., `"9:00 AM to 5:00 PM"`)*.

**Public Static Methods**
- `displayOpeningHours()`  
  Prints the library’s opening hours in a user-friendly format.
- `calculateFine(int overdueDays)`  
  Returns the fine as a `double`, computed as:
  ```java
  overdueDays * fineRate

## Sample Output

```text

Library Opening Hours: 9:00 AM to 5:00 PM
Fine for 5 overdue days: $2.5
Title: To Kill a Mockingbird, Author: Harper Lee, Year: 1960
Borrowed: No
Title: 1984, Author: George Orwell, Year: 1949
Borrowed: No
To Kill a Mockingbird has been checked out.
To Kill a Mockingbird is already borrowed.
To Kill a Mockingbird has been returned.
To Kill a Mockingbird was not borrowed.


