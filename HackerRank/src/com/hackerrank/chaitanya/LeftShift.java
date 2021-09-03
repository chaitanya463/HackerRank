package com.hackerrank.chaitanya;

import java.util.ArrayList;
import java.util.List;

public class LeftShift {

    public static void main(String... args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }

        List<Integer> result = rotateList(list, 1);

    }

    public static List<Integer> rotateList(List<Integer> list, int d) {
        List<Integer> result = new ArrayList<>();
        int size = list.size();
        for (int i = 0; i < list.size(); i++) {
            int val = list.get((d + i) % size);
            result.add(val);
        }

        for (int i : result) {
            System.out.println(result.get(i));
        }
        return result;
    }
}
