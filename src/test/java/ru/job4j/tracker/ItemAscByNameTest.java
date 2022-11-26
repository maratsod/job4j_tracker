package ru.job4j.tracker;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

class ItemAscByNameTest {
    @Test
    public void whenAscByName() {
        List<Item> list = Arrays.asList(
                new Item("qw"),
                new Item("as"),
                new Item("zx")
        );
        list.sort(new ItemAscByName());

        List<Item> expected = Arrays.asList(
                new Item("as"),
                new Item("qw"),
                new Item("zx")
        );
        assertThat(expected).isEqualTo(list);
    }
}