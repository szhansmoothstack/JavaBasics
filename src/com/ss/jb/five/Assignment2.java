package com.ss.jb.five;

import java.util.ArrayList;
import java.util.List;

public class Assignment2 {

    private static String oddOrEven(List<Integer> nums) {
        StringBuilder sb = new StringBuilder();
        nums.forEach(integer -> {
            if (integer % 2 == 0) sb.append("e").append(integer);
            else sb.append("o").append(integer);
            sb.append(", ");
        });
        sb.delete(sb.length() - 2, sb.length() - 1);
        return sb.toString();
    }


    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            nums.add(i);
        }
        System.out.println(oddOrEven(nums));
    }
}
