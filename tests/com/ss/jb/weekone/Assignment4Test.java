package com.ss.jb.weekone;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Assignment4Test {
    private final Assignment4.Assignment4TestHook testHook = new Assignment4.Assignment4TestHook();

    @Test
    void noXTest(){
        List<String> list1 = Arrays.asList("ax", "bb", "cx");
        List<String> list2 = Arrays.asList("xxax", "xbxbx", "xxcx");
        List<String> list3 = Arrays.asList("x");
        assertEquals (Arrays.asList("a", "bb", "c"), testHook.noX(list1));
        assertEquals (Arrays.asList("a", "bb", "c"), testHook.noX(list2));
        assertEquals (Arrays.asList(""), testHook.noX(list3));
    }
}