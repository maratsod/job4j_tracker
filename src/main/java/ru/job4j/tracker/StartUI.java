package ru.job4j.tracker;

public class StartUI {
    private final Item[] items = new Item[100];

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        this.showMenu();
        while (run) {
            int select = Integer.valueOf(input.askStr("Select: "));
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                String name = input.askStr("Enter name: ");
                Item item = new Item(name);
                tracker.add(item);
                System.out.println("=== A new item was created ====");

            } else if (select == 1) {
                System.out.println("=== Show all items ====");
                for (int i = 0; i < items.length; i++) {
                    System.out.println(items[i]);
                }

            } else if (select == 2) {
                System.out.println("=== Edit item ====");
                int id = Integer.valueOf(input.askStr("=== Enter item's id ===="));
                String name = input.askStr("=== Change name ====");
                Item newItem = new Item(name);
                if (tracker.replace(id, newItem)) {
                    System.out.println("=== Item was replaced ====");
                } else {
                    System.out.println("=== Item was not replaced, try again ====");
                }

            } else if (select == 3) {
                System.out.println("=== Delete item ====");
                int id = Integer.valueOf(input.askStr("=== Enter item's id ===="));
                if (tracker.delete(items, id)) {
                    System.out.println("=== Item was deleted ====");
                } else {
                    System.out.println("=== Item was not deleted, try again ====");
                }

            } else if (select == 4) {
                System.out.println("=== Find item by Id ====");
                int id = Integer.valueOf(input.askStr("Enter Id: "));
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println("=== Item " + item + " was found by id ====");
                } else {
                    System.out.println("=== Try again ====");
                }

            } else if (select == 5) {
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
