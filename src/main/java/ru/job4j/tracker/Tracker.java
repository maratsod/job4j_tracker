package ru.job4j.tracker;
import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;
    private Item[] withoutNull = new Item[items.length];

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        for (int index = 0; index < items.length; index++) {
            Item item = items[index];
            if (item != null) {
                withoutNull[size] = item;
                size++;
            }
        }
        withoutNull = Arrays.copyOf(withoutNull, size);
        for (int index = 0; index < withoutNull.length; index++) {
            System.out.println(withoutNull[index]);
        }
        return Arrays.copyOf(withoutNull, size);
    }

    public Item[] findByName(String key) {
        Item[] rsl = new Item[100];
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getName() == key) {
                rsl[size] = items[index];
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}