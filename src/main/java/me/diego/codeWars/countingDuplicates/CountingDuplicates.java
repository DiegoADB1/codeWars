package me.diego.codeWars.countingDuplicates;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        if(text.length() == 0) return 0;

        String lowercase = text.toLowerCase();

        Map<Character, List<Integer>> position = new HashMap<>();
        for (int i = 0; i < lowercase.split("").length; i++) {
            List<Integer> integers = position.get(lowercase.charAt(i));
            if (integers == null) {
                integers = new ArrayList<>();
            }

            integers.add(i);
            position.put(lowercase.charAt(i), integers);
        }
        AtomicInteger count = new AtomicInteger();
        position.forEach((character, list) -> {
            if(list.size() > 1) count.getAndIncrement();
        });
        return count.get();
    }
}
