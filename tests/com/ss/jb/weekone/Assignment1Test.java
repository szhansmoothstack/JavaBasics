package com.ss.jb.weekone;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class Assignment1Test {
    Assignment1.Assignment1TestHook testHook = new Assignment1.Assignment1TestHook();
    private final PrintStream originalOut = System.out;
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp(){
        System.setOut (new PrintStream(outputStream));
    }

    @Test
    void isOddTest(){
        assertTrue (testHook.isOdd(3));
        assertFalse(testHook.isOdd(6));
    }

    @Test
    void isPrimeTest(){
        assertTrue (testHook.isPrime(3));
        assertFalse(testHook.isPrime(6));
    }

    @Test
    void isPalindromeTest(){
        assertTrue (testHook.isPalindrome(363));
        assertFalse(testHook.isPalindrome(655));
    }

    @Test
    void mainTest() throws Exception {
        final InputStream originalStream = System.in;
        final FileInputStream inputStream = new FileInputStream(
                new File("C:\\Users\\Zhan\\Documents\\SmoothStack\\JavaBasics\\tests\\com\\ss\\jb\\weekone\\Assignment1TestInput.txt"));
        System.setIn(inputStream);
        Assignment1.main(null);
        System.setIn (originalStream);
        assertEquals ("EVEN\r\nPRIME\r\nPALINDROME\r\nODD\r\nCOMPOSITE", outputStream.toString().trim());
    }
}