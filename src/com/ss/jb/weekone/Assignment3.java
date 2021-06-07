package com.ss.jb.weekone;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Assignment3 {
    private static List<Integer> doubling(List<Integer> nums) {
        nums.replaceAll(n -> n * 2);
        return nums;
    }

    public static void main(String[] args){
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(6, 8, 6, 8, -1);
        List<Integer> list3 = Collections.emptyList();
        System.out.println(doubling(list1));
        System.out.println(doubling(list2));
        System.out.println(doubling(list3));
    }
}
