package main.java.sandbox.comparableVersusComparator;

import main.java.sandbox.comparableVersusComparator.bookComparators.AuthorComparator;
import main.java.sandbox.comparableVersusComparator.bookComparators.UltimateComparator;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();

        books.add(new Book("Java - Guia do Programador: Atualizado Para Java 16", "Peter Jandl Junior", 2021));
        books.add(new Book(
                "Microsserviços Prontos Para a Produção: Construindo Sistemas Padronizados em uma Organização de Engenharia de Software",
                "Susan J. Fowler", 2017));
        books.add(new Book("Kotlin em Ação", "Dmitry Jemerov e Svetlana Isakova", 2017));
        books.add(new Book("Entendendo Algoritmos: Um Guia Ilustrado Para Programadores e Outros Curiosos",
                "Aditya Y. Bhargava", 2017));
        books.add(new Book("Desenvolvimento Real de Software: Um guia de projetos para fundamentos em Java",
                "Raoul-Gabriel Urma e  Richard Warburton", 2021));

        System.out.println("Todos os livros disponíveis: ");
        Collections.sort(books, new UltimateComparator());
        for (Book book : books) {
            System.out.println(book.toString());
        }


    }
}
