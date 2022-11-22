package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public boolean isEquals(String originText, String duplicateText) {
        HashSet<String> set = new HashSet<>();
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        /* for-each origin -> new HashSet. */
        for (String str : origin) {
            set.add(str);
        }
        /* for-each text -> hashSet.contains */
        for (String str : text) {
            if (!set.contains(str)) {
                rsl = false;
                break;
            }
         }
        return rsl;
    }
}
