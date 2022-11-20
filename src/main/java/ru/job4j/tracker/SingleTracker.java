package ru.job4j.tracker;

public class SingleTracker {
    private Tracker tracker = new Tracker();
    private static SingleTracker singleTracker = null;

    private SingleTracker(){}

    private static SingleTracker getSingleTracker() {
        if (singleTracker == null) {
            singleTracker = new SingleTracker();
        }
        return singleTracker;
    }

    public Item add(Item item) {
        return tracker.add(item);
    }

    public Item findById(int id) {
        return tracker.findById(id);
    }

    public boolean deleteItem(int id) {
        return tracker.delete(id);
    }

    public boolean editItem(int id, Item item) {
        return tracker.replace(id, item);
    }

    public Item[] findByName(String name) {
        return tracker.findByName(name);
    }

    public Item[] showItems() {
        return tracker.findAll();
    }
}
