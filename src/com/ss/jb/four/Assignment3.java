package com.ss.jb.four;

import java.util.LinkedList;

public class Assignment3 {
    //Class includes all parts: list, producer and consumer
    public static class ProducerConsumer {

        int cap = 3;
        LinkedList<Integer> buffer = new LinkedList<>();

        //method used by producer thread to produce
        public void produce() throws InterruptedException {
            int val = 1;
            while (true) {
                synchronized (this) {

                    //if buffer is full then wait
                    while (buffer.size() >= cap) wait();

                    //produce and add to the buffer
                    System.out.println("Produced: " + val);
                    buffer.add(val ++);

                    //now notify consumer thread they can begin consuming
                    notify();

                    //add a pause to make output easier to read
                    Thread.sleep(2500);
                }
            }
        }

        //method for consumer thread to consume
        public void consume() throws InterruptedException{

            int val;

            while (true){
                synchronized (this){
                    //if buffer is empty then wait
                    while (buffer.size() == 0) wait();

                    //consume and print value consumed
                    val = buffer.removeFirst();
                    System.out.println("Consumed: " + val);

                    //notify producer thread that it can now produce
                    notify();

                    //add a pause to make output easier to read
                    Thread.sleep(2500);
                }
            }
        }
    }

    public static void main (String[] args){
        try{
            ProducerConsumer pc = new ProducerConsumer();

            //new producer thread
            Thread producerThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try{
                        pc.produce();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            });

            //new consumer thread
            Thread consumerThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try{
                        pc.consume();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            });

            producerThread.start();
            consumerThread.start();

            producerThread.join();
            consumerThread.join();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
