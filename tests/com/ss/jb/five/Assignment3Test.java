package com.ss.jb.five;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Assignment3Test {
    private final Assignment3.Assignment3TestHook testHook = new Assignment3.Assignment3TestHook();

    @Test
    void searchA3Test(){
        List<String> str = Arrays.asList("Hello", "Testing", "abc", "tre", "arc", "atv", "his");
        assertEquals(Arrays.asList("abc", "arc", "atv"), testHook.searchA3(str));
    }
}