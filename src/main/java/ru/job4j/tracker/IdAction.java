package ru.job4j.tracker;

public class IdAction implements UserAction  {
    private final Output out;

    public IdAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== Find item by Id ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter Id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            out.println("=== Item was found by id ====");
        } else {
            out.println("=== Try again ====");
        }
        return true;
    }
}
