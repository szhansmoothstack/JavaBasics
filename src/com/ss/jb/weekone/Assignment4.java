package com.ss.jb.weekone;

import java.util.Arrays;
import java.util.List;

public class Assignment4 {
    private static List<String> noX(List<String> strings) {
        strings.replaceAll(n -> n.replace("x", ""));
        return strings;
    }
    public static void main(String[] args){
        List<String> list1 = Arrays.asList("ax", "bb", "cx");
        List<String> list2 = Arrays.asList("xxax", "xbxbx", "xxcx");
        List<String> list3 = Arrays.asList("x");
        System.out.println(noX(list1));
        System.out.println(noX(list2));
        System.out.println(noX(list3));
    }
}
