package me.diego.codeWars.squareDigit;

import java.util.stream.Collectors;

public class SquareDigit {
    public int squareDigits(int n) {
        return Integer.parseInt(String.valueOf(n)
                .chars()
                .map(Character::getNumericValue)
                .map(num -> num * num)
                .mapToObj(Integer::toString)
                .collect(Collectors.joining()));
    }
}
