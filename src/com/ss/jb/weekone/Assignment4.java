package com.ss.jb.weekone;

import java.util.Arrays;
import java.util.List;

public class Assignment4 {
    private static List<String> noX(List<String> strings) {
        strings.replaceAll(n -> n.replace("x", ""));
        return strings;
    }

    public static class Assignment4TestHook {
        public List<String> noX (List<String> strings){
            return Assignment4.noX(strings);
        }
    }
}
