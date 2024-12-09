package com.fellon;

public class Book {
    private String title;
    private String author;
    private int year;
    private boolean isAvailable;

    public Book(String title, String author, int year, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = isAvailable;
    }
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.year = 0;
        this.isAvailable = true;
    }

    public void borrowBook() {
        if (this.isAvailable) {
            this.isAvailable = false;
            System.out.println("Книга :" + title + " - недоступна!");
        }
    }
    public void returnBook() {
        this.isAvailable = true;
        System.out.println("Книга: " + title + " - доступна");
    }
    public void displayInfo() {
        System.out.println("Название: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Год: " + year);
        System.out.println("Книга " + (isAvailable ? " - доступна" : " - недоступна"));
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
