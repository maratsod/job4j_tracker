package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book = new Book("q", 123);
        Book book1 = new Book("w", 234);
        Book book2 = new Book("e", 345);
        Book book3 = new Book("Clean code", 456);
        Book[] books = new Book[4];
        books[0] = book;
        books[1] = book1;
        books[2] = book2;
        books[3] = book3;

        for (int i = 0; i < books.length; i++) {
            Book b = books[i];
            System.out.println(b.toString());
        }

        Book temp = books[0];
        books[0] =  books[3];
        books[3] = temp;
        System.out.println();

        for (int i = 0; i < books.length; i++) {
            Book b = books[i];
            System.out.println(b.toString());
        }

        System.out.println();

        for (int i = 0; i < books.length; i++) {
            Book b = books[i];
            if (b.getTitle().equals("Clean code")) {
                System.out.println(b.toString());
            }
        }

    }
}
