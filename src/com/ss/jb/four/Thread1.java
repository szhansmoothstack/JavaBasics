package com.ss.jb.four;

//Thread class
public class Thread1 extends Thread {
    private Resource resource1;
    private Resource resource2;

    public Thread1(Resource resource1, Resource resource2) {
        this.resource1 = resource1;
        this.resource2 = resource2;
    }

    @Override
    public void run() {
        resource1.action1(resource2);
    }
}
