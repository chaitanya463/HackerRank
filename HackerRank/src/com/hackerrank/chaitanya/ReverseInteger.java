package com.hackerrank.chaitanya;

public class ReverseInteger {

    public static void main(String... args) {
        int num = -1230;
        reverseInteger(num);
    }

    private static void reverseInteger(int num) {
        int rev = 0;
        while(num != 0) {
            int pop =  num % 10;
            System.out.println(" pop = " + pop);
            num = num / 10;
            rev = rev * 10 + pop;
        }
        System.out.println(rev);
    }
}
