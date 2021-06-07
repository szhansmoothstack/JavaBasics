package com.ss.jb.four;

//class used to sleep threads
public class Sleeper {
    static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
