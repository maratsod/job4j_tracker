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
    public static void showItems(Item[] items) {
        System.out.println("=== Show all items ====");
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
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
    public static void deleteItem(Input input, Item[] items, Tracker tracker) {
        System.out.println("=== Delete item ====");
        int id = input.askInt("=== Enter item's id ====");
        if (tracker.delete(items, id)) {
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


    public void init(Input input, Tracker tracker) {
        boolean run = true;
        this.showMenu();
        while (run) {
            int select = input.askInt("Select: ");
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.showItems(items);

            } else if (select == 2) {
                StartUI.replaceItem(input, tracker);

            } else if (select == 3) {
                StartUI.deleteItem(input, items, tracker);

            } else if (select == 4) {
                StartUI.findById(input, tracker);

            } else if (select == 5) {
                StartUI.findByName(input, tracker);
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item.");
        System.out.println("1. Show all items.");
        System.out.println("2. Edit item.");
        System.out.println("3. Delete item.");
        System.out.println("4. Find item by Id.");
        System.out.println("5. Find items by name.");
        System.out.println("6. Exit Program.");
    }


    public static void main(String[] args) {
        Item[] items = new Item[100];
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
