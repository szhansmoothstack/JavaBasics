package com.ss.jb.weekone;

import java.rmi.activation.ActivationGroup_Stub;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment2 {

    private static List<Integer> rightDigit(List<Integer> nums){
        nums.replaceAll(n -> n % 10);
        return nums;
    }

    public static class Assignment2TestHook {
        public List<Integer> rightDigit (List<Integer> nums){
            return Assignment2.rightDigit(nums);
        }
    }
}