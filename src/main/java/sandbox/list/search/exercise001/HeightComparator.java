package main.java.sandbox.list.search.exercise001;

import java.util.Comparator;

public class HeightComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        return Double.compare(person1.getHeight(), person2.getHeight());
    }
}
