package model;

import java.util.ArrayList;
import java.util.List;

/** The library holds books and registered patrons (see docs/uml-diagram.png). */
public class Library {

    private final String name;
    private final List<Book> books = new ArrayList<>();
    private final List<Patron> patrons = new ArrayList<>();

    public Library(String name) {
        this.name = name;
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book '" + book.getTitle() + "' added to library '" + name + "'.");
    }

    public void removeBook(Book book) {
        if (books.remove(book)) {
            System.out.println("Book '" + book.getTitle() + "' removed from library '" + name + "'.");
        } else {
            System.out.println("Book '" + book.getTitle() + "' not found in library '" + name + "'.");
        }
    }

    public void registerPatron(Patron patron) {
        patrons.add(patron);
        System.out.println("Patron '" + patron.getName() + "' registered at library '" + name + "'.");
    }

    public boolean checkBookAvailability(Book book) {
        boolean available = books.contains(book) && book.checkAvailability();
        System.out.println("Book '" + book.getTitle() + "' is " + (available ? "" : "not ")
                + "available in library '" + name + "'.");
        return available;
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Patron> getPatrons() {
        return patrons;
    }
}
