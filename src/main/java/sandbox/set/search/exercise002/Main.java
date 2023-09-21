package main.java.sandbox.set.search.exercise002;

public class Main {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();

        taskList.addTask("Fazer exercício 001 de Java");
        taskList.addTask("Ir para a academia");
        taskList.addTask("Tomar remédio");
        taskList.markTaskAsCompleted("Tomar remédio");

        System.out.println("Número de tarefas: " + taskList.countTasks() + ". Todas as tarefas: ");
        taskList.showTasks();

        System.out.println("Tarefas imcompletas: " + taskList.getAllallPendingTasks());
        taskList.clearTaskList();

        taskList.showTasks();
    }
}
