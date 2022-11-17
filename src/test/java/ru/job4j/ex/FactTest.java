package ru.job4j.ex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FactTest {
    @Test
    public void whenException() {
        Fact fact = new Fact();
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    fact.calc(-1);
                });
        assertThat(exception.getMessage()).isEqualTo("Less than 0");
    }

    @Test
    public void whenNoException() {
        Fact fact = new Fact();
        int n = 3;
        int expected = 6;
        assertThat(fact.calc(n)).isEqualTo(expected);
    }
}