package com.tyrov.roman;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс для работы со списком ArrayList с использованием цикла for.
 */
public class ArrayListStorage {

    private final List<String> items = new ArrayList<>();

    // Добавление элемента в список
    public void addItem(String item) {
        items.add(item);
        System.out.println("Добавлен элемент: " + item);
    }

    // Поиск элемента в списке
    public boolean findItem(String target) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).equals(target)) {
                System.out.println("Элемент '" + target + "' найден на позиции " + i);
                return true;
            }
        }
        System.out.println("Элемент '" + target + "' не найден");
        return false;
    }

    // Удаление элемента из списка
    public void removeItem(String target) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).equals(target)) {
                items.remove(i);
                System.out.println("Элемент '" + target + "' удалён");
                return;
            }
        }
        System.out.println("Не удалось удалить: элемент '" + target + "' отсутствует");
    }
}
