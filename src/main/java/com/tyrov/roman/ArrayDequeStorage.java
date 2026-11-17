package com.tyrov.roman;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/**
 * Класс для работы с очередью
 */
public class ArrayDequeStorage {

    private final Deque<String> tasks = new ArrayDeque<>();

    // Добавление задачи в конец очереди
    public void addTask(String task) {
        tasks.addLast(task);
        System.out.println("Задача добавлена в очередь: " + task);
    }

    // Поиск задачи в очереди
    public boolean findTask(String targetTask) {
        if (tasks.isEmpty()) {
            System.out.println("Очередь пуста, задача '" + targetTask + "' не найдена");
            return false;
        }

        Iterator<String> iterator = tasks.iterator();
        do {
            String current = iterator.next();
            if (current.equals(targetTask)) {
                System.out.println("Задача '" + targetTask + "' найдена в очереди");
                return true;
            }
        } while (iterator.hasNext());

        System.out.println("Задача '" + targetTask + "' не найдена");
        return false;
    }

    // Удаление задачи из очереди
    public void removeTask(String targetTask) {
        if (tasks.isEmpty()) {
            System.out.println("Очередь пуста, удалять нечего");
            return;
        }

        Iterator<String> iterator = tasks.iterator();
        do {
            String current = iterator.next();
            if (current.equals(targetTask)) {
                iterator.remove();
                System.out.println("Задача '" + targetTask + "' удалена из очереди");
                return;
            }
        } while (iterator.hasNext());

        System.out.println("Задача '" + targetTask + "' не найдена для удаления");
    }
}
