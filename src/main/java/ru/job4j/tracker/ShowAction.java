package ru.job4j.tracker;

public class ShowAction implements UserAction  {
    private final Output out;

    public ShowAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== Show all items ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        for (int i = 0; i < tracker.findAll().length; i++) {
            out.println(tracker.findAll()[i]);
        }
        return true;
    }
}
