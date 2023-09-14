package main.java.sandbox.generics;

public class Main {
    public static void main(String[] args) {
        Shelf<Book> bookShelf = new Shelf<>();

        Book cleanCode = new Book("Clean Code", "Blue", 150);
        Book learnJava = new Book("Learn Java", "White", 159);
        Book learnPython = new Book("Learn Python", "Yellow", 130);

        bookShelf.addObject(cleanCode);
        bookShelf.addObject(learnJava);
        bookShelf.addObject(learnPython);

        bookShelf.showObjectInShelf();

        bookShelf.removeObjects(learnPython);

        bookShelf.showObjectInShelf();
    }
}
