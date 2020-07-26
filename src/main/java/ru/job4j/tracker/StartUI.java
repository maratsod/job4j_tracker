package ru.job4j.tracker;


public class StartUI {
    public static void main(String[] args) {
        Tracker checking = new Tracker();
        Item it = new Item();
        checking.add(it);
        System.out.println(checking.add(it));

    }
}
