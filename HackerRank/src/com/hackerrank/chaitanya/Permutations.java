package com.hackerrank.chaitanya;

import java.util.Scanner;

public class Permutations {

    public static void main(String... args) {

        Scanner sc = new Scanner(System.in);
        String source = sc.next();
        findPermutations(source, 0, source.length()-1);
    }

    private static void findPermutations(String source, int left, int right) {
        if ( left == right) {
            System.out.println(source);
            return;
        }
        for (int i = left; i <= right; i++) {
            source = swap(source, left, i);
            System.out.println("source = "+ source);
            findPermutations(source, left+1, right);
         //   source = swap(source, left, i);
        }
    }

    private static String swap(String source, int left, int i) {
        System.out.println(" source = " + source + " left = " + left + " i = "+i);
        char[] chars = source.toCharArray();
        char temp = chars[left];
        chars[left] = chars[i];
        chars[i] = temp;

        return String.valueOf(chars);
    }
}
