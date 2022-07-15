package me.diego.codeWars.stringToCamelCase;

public class stringToCamelCase {
    static String toCamelCase(String s) {
        if (s.isEmpty()) return "";

        StringBuilder sb = new StringBuilder();
        String[] parts = s.split("[\\-_]");
        for (int i = 0; i < parts.length; i++) {
            String word = parts[i];
            if (i == 0) {
                if (Character.isUpperCase(word.charAt(0))) {
                    word = Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
                    sb.append(word);
                    continue;
                }
                sb.append(word.toLowerCase());
                continue;
            }
            word = Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();

            sb.append(word);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(toCamelCase("the-Stealth_Warrior"));
    }
}
