package com.ss.jb.five;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Assignment2Test {
    private final Assignment2.Assignment2TestHook testHook = new Assignment2.Assignment2TestHook();

    @Test
    void  oddOrEvenTest(){
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            nums.add(i);
        }
       assertEquals ("e0, o1, e2, o3, e4, o5, e6, o7, e8, o9, e10, o11, e12, o13, e14, o15, e16, o17, e18, o19 ",
               testHook.oddOrEven(nums));
    }
}