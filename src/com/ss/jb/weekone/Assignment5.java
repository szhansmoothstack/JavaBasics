package com.ss.jb.weekone;

public class Assignment5 {
    private static boolean groupSumClump(int start, int[] nums, int target) {
        if(start >= nums.length)
            return target == 0;

        int i = start;
        int sum = 0;

        while(i < nums.length && nums[start] == nums[i]) {
            sum += nums[i];
            i++;
        }

        if(groupSumClump(i, nums, target - sum))
            return true;

        return groupSumClump(i, nums, target);
    }

    public static class Assignment5TestHook {
        public boolean groupSumClump (int start, int[] nums, int target){
            return Assignment5.groupSumClump(start, nums, target);
        }
    }
}
