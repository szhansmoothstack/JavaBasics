package com.ss.jb.five;

import java.util.Arrays;
import java.util.Comparator;

public class Assignment1 {
    //Static helper method to sort by letter e
    static class Utils {
        static int sortByE(String s1, String s2) {
            if (s1.contains("e") && !s2.contains("e")) return -1;
            else if (s2.contains("e") && !s1.contains("e")) return 1;
            else return 0;
        }
    }

    public static void main(String[] args) {
        String[] strings = {"12345", "abcdefg", "a", "tes", "54321"};
        System.out.println("Original List:" + Arrays.toString(strings));

        Arrays.sort(strings, Comparator.comparingInt(String::length));
        System.out.println("Sorted by length:" + Arrays.toString(strings));
        Arrays.sort(strings, Comparator.comparingInt(String::length).reversed());
        System.out.println("Sorted by length reversed:" + Arrays.toString(strings));

        Arrays.sort(strings, Comparator.comparingInt(c -> c.charAt(0)));
        System.out.println("Sorted by first letter:" + Arrays.toString(strings));

        Arrays.sort (strings, Comparator.comparingInt(c -> c.contains("e") ? 0: 1));
        System.out.println("Sorted by letter e:" + Arrays.toString(strings));

        strings = new String[]{"12345", "abcdefg", "a", "tes", "54321"};
        System.out.println("Reset to Original List:" + Arrays.toString(strings));

        Arrays.sort(strings, Utils::sortByE);
        System.out.println("Sorted by letter e with static helper:" + Arrays.toString(strings));

    }
}
