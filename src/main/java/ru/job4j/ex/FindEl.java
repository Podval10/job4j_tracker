package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int result = -1;
        /* цикл fori, поскольку нам надо найти индекс искомого элемента в массиве */
        for (int i = 0; i < value.length; i++) {
            if (key == value[i]) {
                result = i;
            }

        }
        if(result < 0){

             throw new ElementNotFoundException("Не найдено");
        }

        return result;
    }

    public static void main(String[] args) {
        try {
            indexOf(new String[]{"DAQSDF", "1111", "2222"},"5555");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
