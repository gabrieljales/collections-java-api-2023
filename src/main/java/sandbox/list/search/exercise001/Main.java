package main.java.sandbox.list.search.exercise001;

public class Main {
    public static void main(String[] args) {
        PersonSorting personSorting = new PersonSorting();

        personSorting.addPerson("Gabriel", 23, 1.65);
        personSorting.addPerson("João", 33, 1.75);
        personSorting.addPerson("Maria", 29, 1.55);

        System.out.println(personSorting.orderByAge());

        System.out.println(personSorting.orderByHeight());
    }
}
