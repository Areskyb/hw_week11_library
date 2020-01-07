import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Book book;
    private Book book2;
    private Book book3;
    private Library library;

    @Before
    public void before(){
        library = new Library();
        book = new Book("Lord of the Rings", "yo mama", "Real");
        book2 = new Book("Starlight","anonymous","metal");
        book3 = new Book("no","yes","female");
    }

    @Test
    public void hasNumberOfBooks(){
        library.addBook(book);
        library.addBook(book2);
        library.addBook(book3);

        assertEquals(3,library.numberOfBooks());
    }

}
