package assignment;

import static org.junit.jupiter.api.Assertions.*;

public class Book {
    private String title;
    private String author;
    private int yearPublished;

    public Book(){
        this.title = "1984";
        this.author = "George Orwell";
        this.yearPublished = 1949;
         assertEquals("1984", book.getTitle());
        assertEquals("George Orwell", book.getAuthor());
        assertEquals(1949, book.getYearPublished());
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }
}
