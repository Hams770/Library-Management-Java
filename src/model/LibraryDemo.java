package model;

/** Console demo of the object-oriented model (no database needed). */
public class LibraryDemo {

    public static void main(String[] args) {
        // Create a library
        Library library = new Library("Central Library");

        // Add some books to the library
        Book book1 = new Book(1, "Harry Potter", "J.K. Rowling");
        Book book2 = new Book(2, "To Kill a Mockingbird", "Harper Lee");
        library.addBook(book1);
        library.addBook(book2);

        // Create a patron and register at the library
        Patron patron = new Patron("John Doe", "123");
        library.registerPatron(patron);

        // Check availability of a book
        library.checkBookAvailability(book1);

        // Remove a book from the library
        library.removeBook(book1);

        // Try to remove a book that doesn't exist
        library.removeBook(book1);

        // Patron borrows a book, then it is no longer available
        patron.borrowBook(book2);
        library.checkBookAvailability(book2);
        patron.returnBook(book2);
    }
}
