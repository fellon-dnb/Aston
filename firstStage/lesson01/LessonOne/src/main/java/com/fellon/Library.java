package com.fellon;

import java.util.ArrayList;
import java.util.List;

public class Library {
    static {
        System.out.println();
        System.out.println("Книги в библиотеке:");
        Library library = new Library();
        library.addBook(new Book("Азбука", "Автор 1", 2000));
        library.addBook(new Book("Библия", "Автор 2", 2010));
        library.addBook(new Book("Уголовный Кодекс", "Автор 3", 2020));
        System.out.println("");
    }

    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " - добавленна в библиотеку");
    }
    public void printAvailbleBooks() {
        int count = 0;
        for (Book book : books) {
            if (book.isAvailable()) {
                count++;
            }
        }
        System.out.println("Сейчас в наличии " + count + " книг: ");
        if (count > 0) {
            for (Book book : books) {
                if (book.isAvailable()) {
                    System.out.println(" - " + book.getTitle());
                }
            }
        } else {
            System.out.println("Нет доступных книг");
        }
    }
    public List<Book> findBooksByAuthor(String author) {

        return books.stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(author))
                .toList();
    }
}
