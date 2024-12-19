package assignment;

public class App {
    public static void main(String[] args) {
        Book book = new Book();
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Year Published: " + book.getYearPublished());
    }
}
