package me.diego.codeWars.camelCase;

public class Solution {
    public static void main(String[] args) {
        String str = "hello world";

        String[] splitedArr = str.split(" ");

        StringBuilder camelCase = new StringBuilder();

        for (String s : splitedArr) {
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (i == 0) {
                    camelCase.append(String.valueOf(chars[i]).toUpperCase());
                    continue;
                }
                camelCase.append(String.valueOf(chars[i]).toLowerCase());
            }
        }

        System.out.println(camelCase);
    }

    public static String camelCase(String str) {
        String[] splitedArr = str.split(" ");

        StringBuilder camelCase = new StringBuilder();

        for (String s : splitedArr) {
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (i == 0) {
                    camelCase.append(String.valueOf(chars[i]).toUpperCase());
                    continue;
                }
                camelCase.append(String.valueOf(chars[i]).toLowerCase());
            }
        }

        return camelCase.toString();
    }
}
