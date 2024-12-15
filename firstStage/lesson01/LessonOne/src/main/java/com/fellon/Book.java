package com.fellon;

public class Book {
    private String title;
    private String author;
    private Integer year;
    private Boolean isAvailable = true;

    public Book(String title, String author, Integer year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
    public Book(String title, String author, Integer year, Boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = isAvailable;
    }
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.year = null;
        this.isAvailable = true;
    }
    public void borrowBook() {
        if (Boolean.TRUE.equals(this.isAvailable)) {
            this.isAvailable = false;
            System.out.println("Вы взяли книгу : " + title);
        } else {
            System.out.println("Книги : " + title + "сейчас нет");
        }
    }
    public void returnBook() {
        this.isAvailable = true;
        System.out.println("Вы вернули книгу : " + title);
    }
    public void displayInfo() {
        String boldTitle = "\033[1m" + title + "\033[0m";
        System.out.println("Название: " + boldTitle);
        System.out.println("Автор: " + author);
        System.out.println("Год: " + (year == null ? "не узазан": year));
        System.out.println("Книга " + (Boolean.TRUE.equals(isAvailable) ? " - доступна" : " - недоступна"));
    }

    public boolean isAvailable() {
        return isAvailable;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getYear() {
        return year;
    }
}
