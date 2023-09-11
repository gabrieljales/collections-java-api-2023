package main.java.sandbox.list.order.exercise001;

public class Main {
    public static void main(String[] args) {
        BookCatalog bookCatalog = new BookCatalog();

        bookCatalog.addBook("Livro 001", "Autor 001", 2000);
        bookCatalog.addBook("Livro 002", "Autor 002", 2002);
        bookCatalog.addBook("Livro 003", "Autor 002", 2004);
        bookCatalog.addBook("Livro 004", "Autor 003", 2006);

        System.out.println(bookCatalog.findByTitle("Livro 001"));
        System.out.println(bookCatalog.findByAuthor("Autor 002"));
        System.out.println(bookCatalog.findByPublicationYearRange(2000, 2004));
    }
}
