package com.ss.jb.weekone;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Assignment3 {
    private static List<Integer> doubling(List<Integer> nums) {
        nums.replaceAll(n -> n * 2);
        return nums;
    }

    public static class Assignment3TestHook {
        public List<Integer> doubling (List<Integer> nums){
            return Assignment3.doubling(nums);
        }
    }
}
