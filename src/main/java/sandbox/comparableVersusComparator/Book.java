package main.java.sandbox.comparableVersusComparator;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int releaseYear;

    public Book(String title, String author, int releaseYear) {
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public int compareTo(Book book) {
        return Integer.compare(releaseYear, book.getReleaseYear());
    }

    @Override
    public String toString() {
        return title + ", " + author + " - " + releaseYear;
    }
}
