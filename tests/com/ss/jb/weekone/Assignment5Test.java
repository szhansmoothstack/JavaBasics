package com.ss.jb.weekone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Assignment5Test {
    private final Assignment5.Assignment5TestHook testHook = new Assignment5.Assignment5TestHook();

    @Test
    void groupSumClumpTest(){
        int[] nums1 = {2, 4, 8};
        int[] nums2 = {1, 2, 4, 8, 1};
        int[] nums3 = {2, 4, 4, 8};

        assertTrue (testHook.groupSumClump(0, nums1, 10));
        assertTrue (testHook.groupSumClump(0, nums2, 14));
        assertFalse (testHook.groupSumClump(0, nums3, 14));
    }

}