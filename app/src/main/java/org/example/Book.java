package assignment;

public class Book {
    private String title;
    private String author;
    private int yearPublished;

    public Book(){
        this.title = "1984";
        this.author = "George Orwell";
        this.yearPublished = 1949;
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
