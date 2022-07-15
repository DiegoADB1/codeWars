package me.diego.codeWars.stringSplit;

public class StringSplit {
    public static String[] solution(String s) {
        String[] result = s.split("(?<=\\G.{" + 2 + "})");

        String finalString = result[result.length - 1];
        if(finalString.length() == 1) {
            finalString += "_";
            result[result.length - 1] = finalString;
        }

        return result;
    }
}
