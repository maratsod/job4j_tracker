package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class DiapasonFuncTest {
    @Test
    public void whenLinear() {
        List<Double> result = DiapasonFunc.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D, 17D);
        assertThat(result, is(expected));
        }

    @Test
    public void whenQuadratic() {
        List<Double> result = DiapasonFunc.diapason(5, 8, x -> x * x);
        List<Double> expected = Arrays.asList(25D, 36D, 49D, 64D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenExponential() {
        List<Double> result = DiapasonFunc.diapason(5, 8, x -> Math.pow(2D, x));
        List<Double> expected = Arrays.asList(32D, 64D, 128D, 256D);
        assertThat(result, is(expected));
    }
    }