package ru.job4j.pojo;

public class Book {
    private String name;
    private int pages;

    public Book(String name, int count) {
        this.name = name;
        this.pages = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
