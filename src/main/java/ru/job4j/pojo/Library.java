package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book gari = new Book("Гарри Потер", 255);
        Book allenkar = new Book("Легкий способ курить", 126);
        Book gogol = new Book("Мертвые души", 360);
        Book cleanCode = new Book("Clean code", 0);
        Book[] books = new Book[4];
        books[0] = gari;
        books[1] = allenkar;
        books[2] = gogol;
        books[3] = cleanCode;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getCount());
        }
        System.out.println(" Меняю местами ячейку 0 на ячейку 3");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getCount());

        }
        System.out.println("Добавляю цикл с выводом книги в консоль с именем Clean code ");
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if (book.getName() == "Clean code") {
                System.out.println(book.getName() + " - " + book.getCount());
            }
        }
    }
}