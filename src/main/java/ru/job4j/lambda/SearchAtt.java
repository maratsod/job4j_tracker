package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class SearchAtt {

    public static List<Attachment> filterSize(List<Attachment> list, int value) {
        Predicate<Attachment> predicate = new Predicate<>() {
            @Override
            public boolean test(Attachment att) {
                return att.getSize() > value;
            }
        };
        return loop(list, predicate);
    }

    public static List<Attachment> filterName(List<Attachment> list, String value) {
        Predicate<Attachment> predicate = new Predicate<>() {
            @Override
            public boolean test(Attachment att) {
                return att.getName().contains(value);
            }
        };
        return loop(list, predicate);
    }

    private static List<Attachment> loop(List<Attachment> list, Predicate<Attachment> predicate) {
        List<Attachment> rsl = new ArrayList<>();
        for (Attachment att : list) {
            if (predicate.test(att)) {
                rsl.add(att);
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("image1", 110),
                new Attachment("image2", 14),
                new Attachment("image3", 1193)
        );
        List<Attachment> compare = filterSize(attachments, 100);
            for (Attachment newAtt : compare) {
                System.out.println(newAtt);
            }
        }
}