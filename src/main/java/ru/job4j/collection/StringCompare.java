package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String>{
    @Override
    public int compare(String left, String right) {
        int rsl = 0;
        int size = Math.min(left.length(), right.length());
        if (left.length() < right.length()) {
             rsl = -1;
                for (int i = 0; i < size; i++) {
                    if (left.charAt(i) != right.charAt(i)) {
                        rsl = Character.compare(left.charAt(i), right.charAt(i));
                        break;
                    }
                }}

        if (left.length() > right.length()) {
            rsl = -1;
            for (int i = 0; i < size; i++) {
                if (left.charAt(i) != right.charAt(i)) {
                    rsl = Character.compare(left.charAt(i), right.charAt(i));
                    break;
                }
            }}

                if (left.length() == right.length()) {
                    for (int i = 0; i < size; i++) {
                        if (left.charAt(i) != right.charAt(i)) {
                            rsl = Character.compare(left.charAt(i), right.charAt(i));
                            break;
                        }
                    }
                }

                return rsl;
            }
     }