package me.diego.codeWars.duplicateEncoder;

import java.util.*;

public class DuplicateEncoder {
    static String encode(String word) {
        String lowerCase = word.toLowerCase();

        Map<Character, List<Integer>> position = new HashMap<>();
        for (int i = 0; i < lowerCase.split("").length; i++) {
            List<Integer> integers = position.get(word.charAt(i));
            if (integers == null) {
                integers = new ArrayList<>();
            }
            integers.add(i);

            position.put(lowerCase.charAt(i), integers);
        }

        StringBuffer sb = new StringBuffer(lowerCase);
        position.forEach((character, list) -> {
            for (int i : list) {
                if(list.size() > 1) {
                    sb.setCharAt(i, ')');
                } if (list.size() == 1) {
                    sb.setCharAt(i, '(');
                }
            }
        });
        return sb.toString();
    }
}
