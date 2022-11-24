package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class LexSortTest {
    @Test
    public void sortNum1and2and10() {
        String[] input = {
                "10. Task.",
                "1. Task.",
                "2. Task."
        };
        String[] out = {
                "1. Task.",
                "2. Task.",
                "10. Task."
        };
        Arrays.sort(input, new LexSort());
        assertThat(input).containsExactly(out);
    }

    @Test
    public void sortNum1and2and1() {
        String[] input = {
                "100. Task.",
                "10. Task.",
                "20. Task."
        };
        String[] out = {
                "10. Task.",
                "20. Task.",
                "100. Task."
        };
        Arrays.sort(input, new LexSort());
        assertThat(input).containsExactly(out);
    }

    @Test
    public void sortNum1and2and() {
        String[] input = {
                "1210. Task.",
                "121. Task.",
                "222. Task."
        };
        String[] out = {
                "121. Task.",
                "222. Task.",
                "1210. Task."
        };
        Arrays.sort(input, new LexSort());
        assertThat(input).containsExactly(out);
    }
}