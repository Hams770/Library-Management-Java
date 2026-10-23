package model;

import java.util.ArrayList;
import java.util.List;

/** A library member who can borrow books (see docs/uml-diagram.png). */
public class Patron {

    private final String name;
    private final String patronId;
    private final List<Book> booksBorrowed = new ArrayList<>();

    public Patron(String name, String patronId) {
        this.name = name;
        this.patronId = patronId;
    }

    public String getName() {
        return name;
    }

    public String getPatronId() {
        return patronId;
    }

    public List<Book> getBooksBorrowed() {
        return booksBorrowed;
    }

    public void borrowBook(Book book) {
        if (book.checkAvailability()) {
            book.setAvailable(false);
            booksBorrowed.add(book);
            System.out.println("Patron '" + name + "' borrowed book '" + book.getTitle() + "'.");
        } else {
            System.out.println("Sorry, '" + book.getTitle() + "' is already borrowed.");
        }
    }

    public void returnBook(Book book) {
        if (booksBorrowed.remove(book)) {
            book.setAvailable(true);
            System.out.println("Patron '" + name + "' returned book '" + book.getTitle() + "'.");
        }
    }
}
