package main.java.sandbox.set.search.exercise002;

import java.util.HashSet;
import java.util.Set;

public class TaskList {
    private Set<Task> taskSet;

    public TaskList() {
        this.taskSet = new HashSet<>();
    }

    public void addTask(String description) {
        taskSet.add(new Task(description));
    }

    public void removeTask(String description) {
        if (!taskSet.isEmpty()) {
            taskSet.removeIf(task -> task.getDescription().equalsIgnoreCase(description));
        }
    }

    public void showTasks() {
        System.out.println(taskSet);
    }

    public int countTasks() {
        return taskSet.size();
    }

    public Set<Task> getAllCompletedTasks() {
        Set<Task> completedTasks = new HashSet<>();

        if (!taskSet.isEmpty()) {
            for (Task task: taskSet) {
                if (task.isCompleted()) {
                    completedTasks.add(task);
                }
            }
        } else {
            throw new RuntimeException("Conjunto vazio!");
        }

        return completedTasks;
    }

    public Set<Task> getAllallPendingTasks() {
        Set<Task> completedTasks = new HashSet<>();

        if (!taskSet.isEmpty()) {
            for (Task task: taskSet) {
                if (!task.isCompleted()) {
                    completedTasks.add(task);
                }
            }
        } else {
            throw new RuntimeException("Conjunto vazio!");
        }

        return completedTasks;
    }

    public Task findTasktByDescription(String description) {
        if (!taskSet.isEmpty()) {
            Task taskToReturn = null;

            for (Task task: taskSet) {
                if (task.getDescription().equalsIgnoreCase(description)) {
                    taskToReturn = task;
                    break;
                }
            }

            return taskToReturn;
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public void markTaskAsCompleted(String description) {
        Task targetTask = this.findTasktByDescription(description);

        if (targetTask != null) {
            targetTask.setCompleted(true);
        } else {
            throw new RuntimeException("Tarefa não encontrada!");
        }
    }

    public void markTaskAsPending(String description) {
        Task targetTask = this.findTasktByDescription(description);

        if (targetTask != null) {
            targetTask.setCompleted(false);
        } else {
            throw new RuntimeException("Tarefa não encontrada!");
        }
    }

    public void clearTaskList() {
        if(taskSet.isEmpty()) {
            System.out.println("A lista já está vazia!");
        } else {
            taskSet.clear();
        }
    }
}
