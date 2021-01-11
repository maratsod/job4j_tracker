package ru.job4j.collection;

import ru.job4j.tracker.Item;

import java.util.Comparator;

public class AgeComparator implements Comparator<User>{
    @Override
    public int compare(User first, User second) {
        return Integer.compare(first.getId(), second.getId());
    }
}
