package me.diego.codeWars.tribonacciSequence;

import java.util.Arrays;

public class Xbonacci {
    public double[] tribonacci(double[] s, int n) {

        double[] newArr=Arrays.copyOf(s, n);
        for (int i = 2; i < n - 1; ) {
            double num1 = newArr[i - 2];
            double num2 = newArr[i - 1];
            double num3 = newArr[i];

            i += 1;

            newArr[i] = num1 + num2 + num3;
        }

        return newArr;
    }

    public static void main(String[] args) {

        double[] s = new double[]{1, 1, 1}; // new double []{1,1,1,3,5,9,17,31,57,105}
        int n = 2;

        double[] newArr=Arrays.copyOf(s, n);
        for (int i = 2; i < n - 1; ) {
            double num1 = newArr[i - 2];
            double num2 = newArr[i - 1];
            double num3 = newArr[i];

            i += 1;

            newArr[i] = num1 + num2 + num3;
        }


        System.out.println(Arrays.toString(newArr));
    }
}
