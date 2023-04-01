package me.diego.codeWars.numberOfZeros;

public class Solution {
    public static int zeros(int n) {
        int res = 0;
        int count = 1;
        int pow = 0;
        while (n > pow) {
            pow = (int) Math.pow(5, count);
            res += n / pow;
            count++;
        }

        return res;
    }
}
