package ru.job4j.tracker;
import static org.hamcrest.core.IsNull.nullValue;
import java.util.List;
import java.util.Arrays;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class StartUITest {
    @Test
    public void whenCreateItem() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[] {"0", "Item name", "1"});
        Tracker tracker = new Tracker();
        UserAction[] actions = {new CreateAction(out), new ExitAction(out)};
        new StartUI(out).init(in, tracker, Arrays.asList(actions));
        assertThat(tracker.findAll().get(0).getName(), is("Item name"));
    }

    @Test
    public void whenReplaceItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Replaced item"));
        item.getId();
        String replacedName = "New item name";
        Input in = new StubInput(new String[]
                {"0", String.valueOf(item.getId()), replacedName, "1"});
        UserAction[] actions = {new ReplaceAction(), new ExitAction(out)};
        new StartUI(out).init(in, tracker, Arrays.asList(actions));
        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
    }

    @Test
    public void whenDeleteItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Deleted item"));
        item.getId();
        Input in = new StubInput(new String[] {"0", String.valueOf(item.getId()), "1"});
        UserAction[] actions = {new DeleteAction(), new ExitAction(out)};
        new StartUI(out).init(in, tracker, Arrays.asList(actions));
        assertNull(tracker.findById(item.getId()));
    }

    @Test
    public void whenFindById() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Find By Id"));
        item.getId();
        Input in = new StubInput(new String[] {"0", String.valueOf(item.getId()), "1"});
        UserAction[] actions = {new IdAction(out), new ExitAction(out)};
        new StartUI(out).init(in, tracker, Arrays.asList(actions));
        String line = System.lineSeparator();
        String expected = "Menu." + line
                + "0. === Find item by Id ====" + line
                + "1. Exit" + line
                + "=== Item was found by id ====" + line
                + "Menu." + line
                + "0. === Find item by Id ====" + line
                + "1. Exit" + line;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void whenFindByName() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Find By Name"));
        String name = item.getName();
        Input in = new StubInput(new String[] {"0", String.valueOf(item.getId()), "1"});
        UserAction[] actions = {new NameAction(out), new ExitAction(out)};
        new StartUI(out).init(in, tracker, Arrays.asList(actions));
        String line = System.lineSeparator();
        String expected = "Menu." + line
                + "0. === Find items by name ====" + line
                + "1. Exit" + line
                + "=== Try again ====" + line
                + "Menu." + line
                + "0. === Find items by name ====" + line
                + "1. Exit" + line;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void whenShowAll() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Show all items"));
        item.getId();
        Input in = new StubInput(new String[] {"0", "1"});
        UserAction[] actions = {new ShowAction(out), new ExitAction(out)};
        new StartUI(out).init(in, tracker, Arrays.asList(actions));
        String line = System.lineSeparator();
        String expected = "Menu." + line
                + "0. === Show all items ====" + line
                + "1. Exit" + line
                + "=== Print all items ====" + line
                + item.toString() + line
                + "Menu." + line
                + "0. === Show all items ====" + line
                + "1. Exit" + line;
        assertThat(out.toString(), is(expected));

    }

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[] {"0"});
        Tracker tracker = new Tracker();
        UserAction[] actions = {new ExitAction(out)};
        new StartUI(out).init(in, tracker, Arrays.asList(actions));
        assertThat(out.toString(), is("Menu."
                + System.lineSeparator() + "0. Exit" + System.lineSeparator()));
    }

    @Test
    public void whenInvalidExit() {
        String line = System.lineSeparator();
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"4", "0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, Arrays.asList(actions));
        assertThat(out.toString(), is(
                String.format(
                        "Menu.%n"
                                + "0. Exit%n"
                                + "Wrong input, you can select: 0 .. 0%n"
                                + "Menu.%n"
                                + "0. Exit%n"
                )
        ));
    }
}




