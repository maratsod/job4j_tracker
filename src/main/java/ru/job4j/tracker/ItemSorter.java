package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ItemSorter {
    public static void main(String[] args) {
        List<Item> it = Arrays.asList(
                new Item(4,"Fix bugs"),
                new Item(2,"Impl task"),
                new Item(1,"Reboot server")
        );
        System.out.println(it);
        Collections.sort(it, new SortByName());
        System.out.println(it);
        Collections.sort(it, new SortById());
        System.out.println(it);
        Collections.sort(it, new ReversedByName());
        System.out.println(it);
        Collections.sort(it, new ReversedById());
        System.out.println(it);
    }
}

