package ru.job4j.tracker;

public class IdAction implements UserAction  {
    @Override
    public String name() {
        return "=== Find item by Id ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter Id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println("=== Item " + item + " was found by id ====");
        } else {
            System.out.println("=== Try again ====");
        }
        return true;
    }
}
