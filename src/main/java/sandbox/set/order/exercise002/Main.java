package main.java.sandbox.set.order.exercise002;

public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();

        studentManager.addStudent("João", 2L, 6.0);
        studentManager.addStudent("Gabriel", 1L, 9.0);
        studentManager.addStudent("Maria", 3L, 8.0);

        System.out.println("Estudantes ordenados por nome: " + studentManager.showStudentsOrderedByName());
        System.out.println("Estudantes ordenados por nota: " + studentManager.showStudentsOrderedByScore());

        studentManager.removeStudent(2L);
        studentManager.showAllStudents();
    }
}
