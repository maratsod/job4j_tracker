package ru.job4j.tracker;

public class NameAction implements UserAction  {
    @Override
    public String name() {
        return "=== Find items by name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        Item[] items = tracker.findByName(name);
        if (items.length > 0) {
            for (int index = 0; index < items.length; index++) {
                System.out.println("=== Item " + items[index] + " was found by name ====");
            }
        }else {
            System.out.println("=== Try again ====");
        }
        return true;
    }
}
