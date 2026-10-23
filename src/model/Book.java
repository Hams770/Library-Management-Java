package model;

/** A book in the library (see docs/uml-diagram.png). */
public class Book {

    private final int bookId;
    private final String title;
    private final String author;
    private boolean available = true;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean checkAvailability() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "'" + title + "' by " + author + " (ID " + bookId + ")";
    }
}
