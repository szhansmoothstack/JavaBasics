package com.ss.jb.four;

public class Thread2 extends Thread {
    private Resource resource1;
    private Resource resource2;

    public Thread2(Resource resource1, Resource resource2) {
        this.resource1 = resource1;
        this.resource2 = resource2;
    }

    @Override
    public void run() {
        resource2.action1(resource1);
    }

}
