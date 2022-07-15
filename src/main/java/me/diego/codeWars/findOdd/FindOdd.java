package me.diego.codeWars.findOdd;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class FindOdd {
    public static int findIt(int[] a) {
        Map<Integer, List<Integer>> position = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            List<Integer> integers = position.get(a[i]);
            if (integers == null) {
                integers = new ArrayList<>();
            }

            integers.add(i);
            position.put(a[i], integers);
        }

        AtomicInteger value = new AtomicInteger();

        position.forEach((integer, list) -> {
            if(list.size() % 2 != 0) {
                value.set(integer);
            }
        });

        return value.get();
    }
}
