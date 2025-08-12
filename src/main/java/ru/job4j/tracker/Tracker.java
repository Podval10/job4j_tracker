package ru.job4j.tracker;

// Импортируем утилиты для работы с массивами и объектами
import java.util.Arrays;
import java.util.Objects;

/* Класс Tracker — основной класс для управления заявками (Item).
        */
public class Tracker {
    // Массив для хранения заявок. Максимальная вместимость — 100 элементов.
    private final Item[] items = new Item[100];

    // Счётчик идентификаторов: автоматически присваивает уникальные ID новым заявкам.
    private int ids = 1;

    // Текущее количество элементов в массиве items.
    private int size = 0;

    /* Добавляет новую заявку в трекер.
     * @param item — заявка, которую нужно добавить.
     * @return — возвращает добавленную заявку.
     */
    public Item add(Item item) {
        // Устанавливаем уникальный ID для заявки и увеличиваем счётчик id
        item.setId(ids++);

        // Помещаем заявку в массив items на позицию size и увеличиваем size
        items[size++] = item;


        // Возвращаем item — но это может быть не тот объект, который ожидается из-за строки выше
        return item;
    }

    /* Возвращает все заявки, которые были добавлены в трекер.
     * @return — массив всех заявок.
     */
    public Item[] findAll() {
        // Возвращаем копию массива items длиной size (только заполненные элементы)
        return Arrays.copyOf(items, size);
    }

    /* Ищет заявки по имени.
     * @param name — имя, по которому ищем заявки.
     * @return — массив найденных заявок.
     */
    public Item[] findByName(String name) {
        // Создаём временный массив для хранения совпадений
        Item[] res = new Item[items.length];

        // Счётчик для отслеживания количества совпадений
        int count = 0;

        // Перебираем все элементы, добавленные в трекер
        for (int index = 0; index < size; index++) {
            // Получаем текущий элемент
            Item item = items[index];

            // Проверяем, совпадает ли имя заявки с искомым
            if (Objects.equals(item.getName(), name)) {
                // Если совпадает — добавляем в результирующий массив
                res[count] = item;
                // Увеличиваем счётчик
                count++;
            }
        }

        // Возвращаем копию массива res длиной count (только с найденными элементами)
        return Arrays.copyOf(res, count);
    }

    /**
     * Ищет заявку по её идентификатору.
     *
     * @param id — идентификатор заявки.
     * @return — найденная заявка или null, если заявка не найдена.
     */
    public Item findById(int id) {
        // Предполагаем, что заявка не найдена
        Item result = null;

        // Перебираем все элементы, добавленные в трекер
        for (int index = 0; index < size; index++) {
            // Получаем текущий элемент
            Item item = items[index];

            // Проверяем, совпадает ли его ID с искомым
            if (item.getId() == id) {
                // Сохраняем найденную заявку
                result = item;
                // Прерываем цикл — нам нужна только первая совпавшая заявка
                break;
            }
        }

        // Возвращаем найденную заявку или null
        return result;
    }

    private int indexOf(int id) {
        int result = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                result = index;
                break;
            }
        }
        return result;
    }


    public boolean replace(int id, Item item) {
        boolean popa = false;
        int index = indexOf(id);
        if (index != -1) {

            items[index].setName(item.getName());
            popa = true;
        }

        return popa;
    }

    public void delete(int id) {
        int index = indexOf(id);
        if (index != -1) {
            int start = index + 1;
            int distPos = index;
            int length = size - index - 1 ;

            System.arraycopy(items, start, items, distPos, length);


            items[size - 1] = null;
            size--;

        }

    }
}