package com.mycompany.ayudantialab;

import java.util.ArrayList;
import java.util.Scanner;

public class Ayudantialab {

    private ArrayList<String> tasks;

    public Ayudantialab() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void removeTask(int index) {
        tasks.remove(index);
    }

    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to display.");
        } else {
            System.out.println("Tasks:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println(i + 1 + ". " + tasks.get(i));
            }
        }
    }

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        Ayudantialab listaTareas = new Ayudantialab();

        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Add task");
            System.out.println("2. Delete task");
            System.out.println("3. Show tasks");
            System.out.println("4. Exit");

            int option = scanner.nextInt();
            scanner.nextLine(); // consume new line character

            switch (option) {
                case 1:
                    System.out.print("Enter task: ");
                    String task = scanner.nextLine();
                    listaTareas.addTask(task);
                    break;
                case 2:
                    listaTareas.displayTasks();
                    if (!listaTareas.tasks.isEmpty()) {
                        System.out.print("Enter task number to delete: ");
                        int index = scanner.nextInt();
                        listaTareas.removeTask(index - 1);
                    }
                    break;
                case 3:
                    listaTareas.displayTasks();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
