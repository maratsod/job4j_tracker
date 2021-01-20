package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class StreamUsage {
    public static void main(String[] args) {
        List<Integer> list = List.of(
                -1, 2, -3, 4, -5, 6, -7, 8, -9, 10
        );
        list = list.stream().filter(
                (i) -> i > 0
        ).collect(Collectors.toList());
        list.forEach(System.out::println);
    }
}
