package ru.job4j.tracker;


public class StartUI {
    public static void main(String[] args) {
        Tracker check = new Tracker();
        Item order = new Item(10, "Order");
        check.add(order);
        check.findById(10);
        System.out.println(check.findById(10));

    }
}
