package ru.job4j.tracker;

public class NameAction implements UserAction  {

    private final Output out;

    public NameAction(Output out) {
        this.out = out;
    }

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
               out.println("=== Item " + items[index] + " was found by name ====");
            }
        }else {
            out.println("=== Try again ====");
        }
        return true;
    }
}
