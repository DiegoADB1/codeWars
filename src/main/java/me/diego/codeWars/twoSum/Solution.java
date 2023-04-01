package me.diego.codeWars.twoSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        List<Integer> arrList = new ArrayList<>();
        Arrays.stream(numbers).forEach(arrList::add);

        for (int num : numbers) {
            int initialIndex = arrList.indexOf(num);
            List<Integer> tempArr = new ArrayList<>(arrList);
            tempArr.remove((Integer) num);

            for (int n : tempArr) {
                if (n + num == target) {
                    int finalIndex = arrList.indexOf(n);
                    if (finalIndex >= initialIndex && n == num) finalIndex++;
                    return new int[]{initialIndex, finalIndex};
                }
            }
        }

        return null;
    }
}
