package com.ss.jb.five;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment3 {

    //Method to search for strings with 3 letters that start with a
    private static List<String> searchA3(List<String> strs) {
        return strs.stream().filter(s -> s.startsWith("a"))
                .filter(s -> s.length() == 3)
                .collect(Collectors.toList());
    }

    public static class Assignment3TestHook {
        public List<String> searchA3 (List<String> strs){
            return Assignment3.searchA3(strs);
        }
    }
}
