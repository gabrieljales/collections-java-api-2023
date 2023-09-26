package main.java.sandbox.set.order.exercise002;

import java.util.Objects;

public class Student {
    private String name;
    private long registration;
    private double score;

    public Student(String name, long registration, double score) {
        this.name = name;
        this.registration = registration;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getRegistration() {
        return registration;
    }

    public void setRegistration(long registration) {
        this.registration = registration;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return registration == student.registration;
    }

    @Override
    public int hashCode() {
        return Objects.hash(registration);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", registration=" + registration +
                ", score=" + score +
                '}';
    }
}
