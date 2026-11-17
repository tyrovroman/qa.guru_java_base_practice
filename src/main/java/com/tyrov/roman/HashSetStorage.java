package com.tyrov.roman;

import java.util.HashSet;
import java.util.Set;

/**
 * Класс для работы с множеством HashSet
 */
public class HashSetStorage {

    private final Set<Integer> numbers = new HashSet<>();

    // Добавление числа в множество
    public void addNumber(int number) {
        if (numbers.add(number)) {
            System.out.println("Число " + number + " добавлено в Set");
        } else {
            System.out.println("Число " + number + " уже существует в Set");
        }
    }

    // Поиск числа
    public boolean findNumber(int target) {
        for (Integer num : numbers) {
            if (num == target) {
                System.out.println("Число " + target + " найдено в множестве");
                return true;
            }
        }
        System.out.println("Число " + target + " не найдено");
        return false;
    }

    // Удаление числа из множества
    public void removeNumber(int target) {
        if (numbers.remove(target)) {
            System.out.println("Число " + target + " удалено из множества");
        } else {
            System.out.println("Число " + target + " не найдено для удаления");
        }
    }
}
