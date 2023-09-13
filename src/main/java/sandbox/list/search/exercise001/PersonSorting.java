package main.java.sandbox.list.search.exercise001;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonSorting {
    private List<Person> personList;

    public PersonSorting() {
        this.personList = new ArrayList<>();
    }

    public void addPerson(String name, int age, double height) {
        personList.add(new Person(name, age, height));
    }

    public List<Person> orderByAge() {
        List<Person> peopleOrderedByAge = new ArrayList<>(personList); // Cópia da lista original
        Collections.sort(peopleOrderedByAge); // Como não passou um Comparator, ele ordena pelo Comparable.compareTo

        return peopleOrderedByAge;
    }

    public List<Person> orderByHeight() {
        List<Person> peopleOrderedByHeight = new ArrayList<>(personList);
        Collections.sort(peopleOrderedByHeight, new HeightComparator());

        return peopleOrderedByHeight;
    }

    public void showPersons() {
        System.out.println(personList);
    }
}
