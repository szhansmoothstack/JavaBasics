package com.ss.jb.five;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Assignment1 {
    static class Utils {
        static int sortByE(String s1, String s2){
            if (s1.contains("e") && !s2.contains("e")) return 10;
            else if (s2.contains("e") && !s1.contains("e")) return -10;
            return 0;
        }
    }
    public static void main (String[] args){
        String[] strings = {"12345","abcdefg", "a", "tes", "54321"};
        System.out.println("Original List:" + Arrays.toString(strings));

        Arrays.sort (strings, Comparator.comparingInt(String::length));
        System.out.println("Sorted by length:" + Arrays.toString(strings));
        Arrays.sort (strings, Comparator.comparingInt(String::length).reversed());
        System.out.println("Sorted by length reversed:" + Arrays.toString(strings));

        Arrays.sort (strings, Comparator.comparingInt(c -> c.charAt(0)));
        System.out.println("Sorted by first letter:" + Arrays.toString(strings));

        //Arrays.sort (strings, Comparator.comparingInt(c -> c.contains("e") ? 0: 1));
        Arrays.sort (strings, (s1,s2) -> Utils.sortByE(s1, s2));
        System.out.println("Sorted by letter e:" + Arrays.toString(strings));


    }
}
