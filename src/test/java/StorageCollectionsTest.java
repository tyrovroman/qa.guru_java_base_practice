import com.tyrov.roman.ArrayDequeStorage;
import com.tyrov.roman.ArrayListStorage;
import com.tyrov.roman.HashMapStorage;
import com.tyrov.roman.HashSetStorage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StorageCollectionsTest {

    @Test
    @DisplayName("Добавление, поиск и удаление элементов (цикл for)")
    void testArrayListStorage() {
        ArrayListStorage storage = new ArrayListStorage();

        // Проверяем добавление и поиск существующего элемента
        storage.addItem("Java");
        storage.addItem("Selenide");
        assertTrue(storage.findItem("Selenide"), "Элемент 'Selenide' должен быть найден");

        // Проверяем поиск несуществующего элемента
        assertFalse(storage.findItem("Python"), "Элемент 'Python' не должен быть найден");

        // Проверяем удаление элемента
        storage.removeItem("Java");
        assertFalse(storage.findItem("Java"), "Элемент 'Java' должен отсутствовать после удаления");
    }

    @Test
    @DisplayName("Добавление, поиск и удаление уникальных чисел")
    void testHashSetStorage() {
        HashSetStorage storage = new HashSetStorage();

        // Проверяем добавление и поиск
        storage.addNumber(100);
        storage.addNumber(200);
        assertTrue(storage.findNumber(100), "Число 100 должно быть найдено в Set");
        assertFalse(storage.findNumber(999), "Число 999 не должно быть найдено");

        // Проверяем удаление
        storage.removeNumber(100);
        assertFalse(storage.findNumber(100), "Число 100 должно отсутствовать после удаления");
    }

    @Test
    @DisplayName("Добавление, поиск ID по имени и удаление (цикл while)")
    void testHashMapStorage() {
        HashMapStorage storage = new HashMapStorage();

        // Проверяем добавление пользователей и поиск ID по имени
        storage.addUser(1, "Иван");
        storage.addUser(2, "Роман");
        assertEquals(2, storage.findUserIdByName("Роман"), "ID пользователя 'Роман' должен быть равен 2");

        // Проверяем поиск отсутствующего пользователя
        assertNull(storage.findUserIdByName("Алексей"), "Для несуществующего пользователя должен возвращаться null");

        // Проверяем удаление пользователя
        storage.removeUserByName("Иван");
        assertNull(storage.findUserIdByName("Иван"), "Пользователь 'Иван' должен быть удалён");
    }

    @Test
    @DisplayName("Добавление, поиск и удаление задач из очереди")
    void testArrayDequeStorage() {
        ArrayDequeStorage storage = new ArrayDequeStorage();

        // Проверяем поиск в пустой очереди
        assertFalse(storage.findTask("Любая задача"), "В пустой очереди поиск должен возвращать false");

        // Добавляем задачи и проверяем их наличие
        storage.addTask("Написать код");
        storage.addTask("Запустить тесты");
        assertTrue(storage.findTask("Запустить тесты"), "Задача 'Запустить тесты' должна быть найдена");

        // Удаляем задачу и проверяем, что её больше нет
        storage.removeTask("Написать код");
        assertFalse(storage.findTask("Написать код"), "Задача 'Написать код' должна отсутствовать после удаления");
    }
}
