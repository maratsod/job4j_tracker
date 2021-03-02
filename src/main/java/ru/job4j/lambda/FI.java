package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class FI {
    public static void main(String[] args) {
        Comparator<String> comparator = (left, right) -> {
            System.out.println("compare - " + left + " : " + right);
            return right.compareTo(left);
        };
        List<String> list = Arrays.asList("January", "February", "March", "April", "May");
        System.out.println(list + " ");
        Collections.sort(list, comparator);
        for (String str : list) {
            System.out.print(str + " ");
        }
    }
}
