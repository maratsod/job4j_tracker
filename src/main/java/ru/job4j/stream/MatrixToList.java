package ru.job4j.stream;

import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class MatrixToList {
    public static void main(String[] args) {
        Integer[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        matrixToList(matrix);
    }

    public static List<Integer> matrixToList(Integer[][] matrix) {
        return Stream.of(matrix)
                .flatMap(Stream::of)
                .collect(Collectors.toList());
    }
}