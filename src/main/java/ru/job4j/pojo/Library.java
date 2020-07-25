package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book first = new Book("German detective", 120);
        Book second = new Book("English tales", 90);
        Book third = new Book("French dictionary", 100);
        Book forth = new Book("Clean code", 10);
        Book[] books = new Book[4];
        books[0] = first;
        books[1] = second;
        books[2] = third;
        books[3] = forth;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " - " + bk.getPages());
        }

        System.out.println("Replace German detective to Clean code.");
        Book temp= books[0];
        books[0] = books[3];
        books[3] = temp;

        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " - " + bk.getPages());
        }
        System.out.println("The books with the title \"Clean code\" are only shown:");
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            if (bk.getName().equals("Clean code")) {
                System.out.println(bk.getName() + " - " + bk.getPages());
            }
        }
    }
}
