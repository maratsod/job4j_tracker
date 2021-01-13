package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.collection.ConvertList;
import static org.hamcrest.Matchers.greaterThan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

    public class ReversedByNameTest {
        @Test
        public void whenSortByName() {
            int rsl = new Item(32, "Petr")
                    .compareTo(
                            new Item(31, "Ivan")
                    );
            assertThat(rsl, greaterThan(0));
        }
    }