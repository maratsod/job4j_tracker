package ru.job4j.tracker;

import java.util.Comparator;

public class ReversedById implements Comparator<Item>{
    @Override
    public int compare(Item first, Item second) {
        if (second.getId() > first.getId()) {
            return 1;
        }
        else if (second.getId() < first.getId()) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
