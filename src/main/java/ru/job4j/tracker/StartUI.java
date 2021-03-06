package ru.job4j.tracker;

import java.util.List;
import java.util.Arrays;

public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    public void init(Input input, Tracker tracker, List<UserAction> actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            if (select < 0 || select >= actions.size()) {
                out.println("Wrong input, you can select: 0 .. " + (actions.size() - 1));
                continue;
            }
            run = actions.get(select).execute(input, tracker);
        }
    }

    private void showMenu(List<UserAction> actions) {
        out.println("Menu.");
        int index = 0;
        for (UserAction action : actions) {
            out.println(index + ". " + action.name());
            index++;
        }
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ValidateInput(output, new ConsoleInput());
        Tracker tracker = new Tracker();
        UserAction[] actions = {new CreateAction(output), new ShowAction(output),
                new ReplaceAction(), new DeleteAction(),
                new IdAction(output), new NameAction(output), new ExitAction(output)};
        new StartUI(output).init(input, tracker, Arrays.asList(actions));
    }
}
