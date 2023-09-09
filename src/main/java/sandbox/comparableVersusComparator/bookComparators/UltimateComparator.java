package main.java.sandbox.comparableVersusComparator.bookComparators;

import main.java.sandbox.comparableVersusComparator.Book;

import java.util.Comparator;

public class UltimateComparator implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        int yearComparison = Integer.compare(book1.getReleaseYear(), book2.getReleaseYear());
        if (yearComparison != 0) {
            return yearComparison;
        }

        int authorComparison = book1.getAuthor().compareTo(book2.getAuthor());
        if (authorComparison != 0) {
            return authorComparison;
        }

        return book1.getTitle().compareTo(book2.getTitle());
    }
}
