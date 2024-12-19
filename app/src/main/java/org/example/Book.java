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


    public Book(String title, String author, int yearPublished ) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public int getYearPublished() {
        return yearPublished;
    }
}



//public class Book {
//    private String title;
//    private String author;
//    private int yearPublished;
//
//    // Constructor
//    public Book(String title, String author, int yearPublished) {
//        this.title = title;
//        this.author = author;
//        this.yearPublished = yearPublished;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(String author) {
//        this.author = author;
//    }
//
//    public int getYearPublished() {
//        return yearPublished;
//    }
//
//    public void setYearPublished(int yearPublished) {
//        this.yearPublished = yearPublished;
//    }
//}
