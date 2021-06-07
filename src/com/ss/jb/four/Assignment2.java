package com.ss.jb.four;

public class Assignment2 {
    //Deadlock example
    public static void main(String[] args) {
        Resource r1 = new Resource();
        Resource r2 = new Resource();

        Thread1 t1 = new Thread1(r1, r2);
        t1.start();

        Thread2 t2 = new Thread2(r1, r2);
        t2.start();

        Sleeper.sleep(2000);
    }
}
