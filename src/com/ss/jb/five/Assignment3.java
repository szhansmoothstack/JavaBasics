package com.ss.jb.five;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment3 {

    private static List<String> searchA3(List<String> strs) {
        return strs.stream().filter(s -> s.startsWith("a"))
                .filter(s -> s.length() == 3)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> str = Arrays.asList("Hello", "Testing", "abc", "tre", "arc", "atv", "his");
        System.out.println(searchA3(str));
    }
}
