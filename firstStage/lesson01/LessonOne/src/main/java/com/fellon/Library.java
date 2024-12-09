package com.fellon;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    public void addBook(Book book){
        books.add(book);
    }
       public void printAvalibleBooks(){
           System.out.println("В наличии:");
           for(Book book : books) {
               if (book.isAvailable()){
                   book.displayInfo();
               }
           }
       }
    public void findBooksByAuthor(String author) {
        System.out.println("Книги " + author + ":");
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                book.displayInfo();
            }
        }
    }
    static {
        Library library = new Library();
        library.addBook(new Book("Конституция Российской Федерации", "Неизвестен", 1993, true));
        library.addBook(new Book("Чистый код", "Роберт Мартин", 2008, true));
        library.addBook(new Book("Грокаем алгоритмы", "Адитья Бхаргава", 2016, true));
    }
    }
