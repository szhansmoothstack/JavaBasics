package com.ss.jb.weekone;

import java.util.Arrays;
import java.util.List;

public class Assignment2 {

    private static List<Integer> rightDigit(List<Integer> nums){
        nums.replaceAll(n -> n % 10);
        return nums;
    }

    public static void main(String[] args){
        List<Integer> list1 = Arrays.asList(1, 22, 93);
        List<Integer> list2 = Arrays.asList(16, 8, 886, 8, 1);
        List<Integer> list3 = Arrays.asList(0, 0);
        System.out.println(rightDigit(list1));
        System.out.println(rightDigit(list2));
        System.out.println(rightDigit(list3));
    }
}
