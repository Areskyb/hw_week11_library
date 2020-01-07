import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;



    public int numberOfBooks() {
        return this.books.size();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }
}
