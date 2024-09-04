package ru.javacode.student;

import java.util.List;
import java.util.Map;

public class Test {

    public static void main(String[] args) {

        List<String> list = List.of("a", "b", "a", "c", "b");
        Map<String, Integer> histogram = Histogram.getHistogram(list);

        System.out.println(histogram);

    }

}
