package main.java.sandbox.list.basicOperations;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TaskList {
    private List<Task> taskList;

    public TaskList() {
        this.taskList = new ArrayList<>();
    }

   public void addTask(String description) {
        taskList.add(new Task(description));
   }

   public void removeTaskByDescription(String description) {
        taskList.removeIf(task -> task.getDescription().equals(description));
   }

   public int getTotalNumberOfTasks() {
        return taskList.size();
   }

   public List<String> getTasksDescriptions() {
       List<String> tasksDescriptions = new ArrayList<>();

       for (Task task : taskList) {
           tasksDescriptions.add(task.getDescription());
       }

       return tasksDescriptions;
   }

    public Set<String> getUniqueTasksDescriptions() {
        Set<String> uniqueDescriptions = new HashSet<>();

        for (Task task : taskList) {
            uniqueDescriptions.add(task.getDescription());
        }

        return uniqueDescriptions;
    }

    public void printTasksDescrirptions() {
        System.out.println(taskList);
    }
}
