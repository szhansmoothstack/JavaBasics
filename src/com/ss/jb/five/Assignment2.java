package com.ss.jb.five;

import java.util.ArrayList;
import java.util.List;

public class Assignment2 {

    //method to add o or e to the numbers based on odd or even
    //returns the resulting string
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

    public static class Assignment2TestHook {
        public String oddOrEven (List<Integer> nums){
            return Assignment2.oddOrEven(nums);
        }
    }
}
