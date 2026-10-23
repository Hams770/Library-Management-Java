
import java.util.ArrayList;
import java.util.List;

public class Library {

    public List<Book> Books;
    public String name;

    public Library(String name) {
        this.name = name;
        this.Books = new ArrayList<>();
    }
    public void addBook(Book book) {
        this.Books.add(book);
        System.out.println("Book '" + book.getTitle() + "' added to library '" + this.name + "'.");
    }

    public void removeBook(Book book) {
        if (this.Books.remove(book)) {
            System.out.println("Book '" + book.getTitle() + "' removed from library '" + this.name + "'.");
        } else {
            System.out.println("Book '" + book.getTitle() + "' not found in library '" + this.name + "'.");
        }
    }

    public void add_Patron(Patron patron) {
        System.out.println("Patron '" + patron.getName() + "' registered at library '" + this.name + "'.");
    }

    public void checkAvailability(Book book) {
        if (this.Books.contains(book)) {
            System.out.println("Book '" + book.getTitle() + "' is available in library '" + this.name + "'.");
        } else {
            System.out.println("Book '" + book.getTitle() + "' is not available in library '" + this.name + "'.");
        }
    
}
