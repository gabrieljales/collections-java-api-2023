package main.java.sandbox.list.search.exercise001;

import java.util.ArrayList;
import java.util.List;

public class BookCatalog {
    private List<Book> bookList;

    public BookCatalog() {
        this.bookList = new ArrayList<>();
    }

    public void addBook(String title, String author, int publicationYear) {
        bookList.add(new Book(title, author, publicationYear));
    }

    public List<Book> findByAuthor(String author) {
        List<Book> booksWithProvidedAuthor = new ArrayList<>();

        if (!bookList.isEmpty()) {
            for (Book book : bookList) {
                if (book.getAuthor().equalsIgnoreCase(author)) {
                    booksWithProvidedAuthor.add(book);
                }
            }
        }

        return booksWithProvidedAuthor;
    }

    public List<Book> findByPublicationYearRange(int initialYear, int finalYear) {
        List<Book> booksWithProvidedYearRange = new ArrayList<>();

        if (!bookList.isEmpty()) {
            for (Book book : bookList) {
                if (book.getPublicationYear() >= initialYear && book.getPublicationYear() <= finalYear) {
                    booksWithProvidedYearRange.add(book);
                }
            }
        }

        return booksWithProvidedYearRange;
    }

    public Book findByTitle(String title) {
        Book bookWithProvidedTitle = null;

        if (!bookList.isEmpty()) {
            for (Book book : bookList) {
                if (book.getTitle().equalsIgnoreCase(title)) {
                    bookWithProvidedTitle = book;
                    break;
                }
            }
        }
        return bookWithProvidedTitle;
    }
}
