package com.ss.jb.four;

//class to represent the resource being accessed
public class Resource {
    synchronized void action1(Resource other) {
        System.out.println("action 1 start");
        Sleeper.sleep(1000);

        other.action2();
        System.out.println("action 1 end");
    }

    synchronized void action2() {
        System.out.println("action2 start");
        Sleeper.sleep(1000);

        System.out.println("action 2 end");
    }
}