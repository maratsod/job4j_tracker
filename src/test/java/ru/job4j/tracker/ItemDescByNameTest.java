package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

class ItemDescByNameTest {
    @Test
    public void whenDescByName() {
        List<Item> list = new ArrayList<>();
        list.add(new Item(1, "qw"));
        list.add(new Item(2, "as"));
        list.add(new Item(3, "zx"));
        list.sort(new ItemDescByName());

        List<Item> expected = new ArrayList<>();
        expected.add(new Item(3, "zx"));
        expected.add(new Item(1, "qw"));
        expected.add(new Item(2, "as"));
        assertThat(list).isEqualTo(expected);

    }
}