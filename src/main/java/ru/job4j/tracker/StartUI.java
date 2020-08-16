package ru.job4j.tracker;

public class StartUI {
    private final Item[] items = new Item[100];

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("=== A new item was created ====");
    }
    public static void showItems(Tracker tracker) {
        System.out.println("=== Show all items ====");
        tracker.findAll();
    }
    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("=== Edit item ====");
        int id = input.askInt("=== Enter item's id ====");
        String name = input.askStr("=== Change name ====");
        Item newItem = new Item(name);
        if (tracker.replace(id, newItem)) {
            System.out.println("=== Item was replaced ====");
        } else {
            System.out.println("=== Item was not replaced, try again ====");
        }
    }
    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete item ====");
        int id = input.askInt("=== Enter item's id ====");
        if (tracker.delete(id)) {
            System.out.println("=== Item was deleted ====");
        } else {
            System.out.println("=== Item was not deleted, try again ====");
        }
    }
    public static void findById(Input input, Tracker tracker) {
        System.out.println("=== Find item by Id ====");
        int id = input.askInt("Enter Id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println("=== Item " + item + " was found by id ====");
        } else {
            System.out.println("=== Try again ====");
        }
    }
    public static void findByName(Input input, Tracker tracker) {
        System.out.println("=== Find items by name ====");
        String name = input.askStr("Enter name: ");
        Item[] items = tracker.findByName(name);
        if (items.length > 0) {
            for (int index = 0; index < items.length; index++) {
                System.out.println("=== Item " + items[index] + " was found by name ====");
            }
        }else {
            System.out.println("=== Try again ====");
        }
    }
    public static void Exit(Input input, Tracker tracker) {
    }
    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }
    private void showMenu(UserAction[] actions) {
        System.out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }
    }
    public static void main(String[] args) {
        Item[] items = new Item[100];
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {new CreateAction(), new ShowAction(),
                new ReplaceAction(), new DeleteAction(),
                new IdAction(), new NameAction(), new ExitAction()};
        new StartUI().init(input, tracker, actions);
    }
}
