package main.java.sandbox.set.order.exercise002;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class StudentManager {
    private Set<Student> studentSet;

    public StudentManager() {
        this.studentSet = new HashSet<>();
    }

    public void addStudent(String name, long registration, double score) {
        studentSet.add(new Student(name, registration, score));
    }

    public void removeStudent(long registration) {
        if (!studentSet.isEmpty()) {
            studentSet.removeIf(student -> student.getRegistration() == registration);
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public Set<Student> showStudentsOrderedByName() {
        if (!studentSet.isEmpty()) {
            Set<Student> studentsOrderedByName = new TreeSet<>(new NameComparator());
            studentsOrderedByName.addAll(studentSet);
            return studentsOrderedByName;
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public Set<Student> showStudentsOrderedByScore() {
        if (!studentSet.isEmpty()) {
            Set<Student> studentsOrderedByScore = new TreeSet<>(new ScoreComparator());
            studentsOrderedByScore.addAll(studentSet);
            return studentsOrderedByScore;
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public void showAllStudents() {
        System.out.println(studentSet);
    }
}
