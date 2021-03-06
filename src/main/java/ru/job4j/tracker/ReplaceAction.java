package ru.job4j.tracker;

public class ReplaceAction implements UserAction  {
    @Override
    public String name() {
        return "=== Edit item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("=== Enter item's id ====");
        String name = input.askStr("=== Change name ====");
        Item newItem = new Item(name);
        if (tracker.replace(id, newItem)) {
            System.out.println("=== Item was replaced ====");
        } else {
            System.out.println("=== Item was not replaced, try again ====");
        }
        return true;
    }
}
