package main.java.sandbox.generics;

public class Book {
    private String name;
    private String color;
    private int numberOfPages;

    public Book(String name, String color, int numberOfPages) {
        this.name = name;
        this.color = color;
        this.numberOfPages = numberOfPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", numberOfPages=" + numberOfPages +
                '}';
    }
}
