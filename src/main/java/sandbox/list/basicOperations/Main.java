package main.java.sandbox.list.basicOperations;

import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();

        taskList.addTask("Task 001");
        taskList.addTask("Task 002");
        taskList.addTask("Task 003");

//        List<String> tasksDescriptions = taskList.getTasksDescriptions();
        Set<String> uniqueTasksDescriptions = taskList.getUniqueTasksDescriptions();

        System.out.println(taskList.getTotalNumberOfTasks());
        for (String taskDescription : uniqueTasksDescriptions) {
            System.out.println(taskDescription);
        }
    }
}
