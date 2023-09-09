package main.java.sandbox.comparableVersusComparator.bookComparators;

import main.java.sandbox.comparableVersusComparator.Book;

import java.util.Comparator;

public class AuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        return book1.getAuthor().compareTo(book2.getAuthor());
    }
}
