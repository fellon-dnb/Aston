package com.fellon;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        System.out.println("Принесенные книги:");
        Book book1 = new Book("Трансерфинг Реальности", "Вадим Зеланд");
        Book book2 = new Book("О дивный новый мир", "Олдос Хаксли", 1932, true);
        Book book3 = new Book("Перезагрузка", "Артур Хейли", 1986, true);
        Book book4 = new Book("Конституция Российской Федерации", "Неизвестен", 1993, true);
        Book book5 = new Book("Чистый код", "Роберт Мартин", 2008, true);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);


        library.printAvailbleBooks();

        System.out.println("Берем книгу...");

        book1.borrowBook();


        library.printAvailbleBooks();


        System.out.println("Возвращаем книгу...");
        book1.returnBook();

        library.printAvailbleBooks();

    }
}