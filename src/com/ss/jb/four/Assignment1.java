package com.ss.jb.four;

public class Assignment1 {
    private static Assignment1 instance;

    private Assignment1(){

    }

    public static Assignment1 getInstance(){
        if (instance == null) {
            synchronized (Assignment1.class){
                if (instance == null)
                    instance = new Assignment1();
            }
        }
        return instance;
    }
}
