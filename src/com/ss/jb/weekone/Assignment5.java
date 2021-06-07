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

    public static void main(String[] args){
        int[] nums1 = {2, 4, 8};
        int[] nums2 = {1, 2, 4, 8, 1};
        int[] nums3 = {2, 4, 4, 8};
        System.out.println(groupSumClump(0, nums1, 10));
        System.out.println(groupSumClump(0, nums2, 14));
        System.out.println(groupSumClump(0, nums3, 14));
    }
}
