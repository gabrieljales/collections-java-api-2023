package main.java.sandbox.set.order.exercise002;

import java.util.Comparator;

public class ScoreComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s1.getScore(), s2.getScore());
    }
}
