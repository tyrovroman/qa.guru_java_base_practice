package com.tyrov.roman;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Класс для работы с массивом HashMap с использованием цикла while.
 */
public class HashMapStorage {

    private final Map<Integer, String> users = new HashMap<>();

    // Добавление пары ключ-значение в Map
    public void addUser(int id, String name) {
        users.put(id, name);
        System.out.println("Добавлен пользователь: ID=" + id + ", Имя=" + name);
    }

    // Поиск пользователя по имени
    public Integer findUserIdByName(String targetName) {
        Iterator<Map.Entry<Integer, String>> iterator = users.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            if (entry.getValue().equals(targetName)) {
                System.out.println("Пользователь '" + targetName + "' найден, его ID: " + entry.getKey());
                return entry.getKey();
            }
        }
        System.out.println("Пользователь '" + targetName + "' не найден");
        return null;
    }

    // Удаление пользователя по имени
    public void removeUserByName(String targetName) {
        Iterator<Map.Entry<Integer, String>> iterator = users.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            if (entry.getValue().equals(targetName)) {
                iterator.remove();
                System.out.println("Пользователь '" + targetName + "' удалён");
                return;
            }
        }
        System.out.println("Пользователь '" + targetName + "' не найден для удаления");
    }
}
