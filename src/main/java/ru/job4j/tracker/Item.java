package ru.job4j.tracker;

public class Item {
     String name;
     String id;

    public Item() {
    }

    public Item(String id) {
        this.id = id;
    }

    public Item(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Item item = new Item();
    }
}
