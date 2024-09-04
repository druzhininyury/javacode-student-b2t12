package ru.javacode.student;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Histogram {

    public static <K> Map<K, Integer> getHistogram(Collection<K> collection) {

        Map<K, Integer> result = new HashMap<>();

        for (K element : collection) {
            if (!result.containsKey(element)) {
                result.put(element, 0);
            }
            result.put(element, result.get(element) + 1);
        }

        return result;
    }

}
