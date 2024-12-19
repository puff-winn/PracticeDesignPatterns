package com.producerConsumer.waitNotifyWay;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainClass {

    public static void main(String[] args) {
        Queue<Integer> buffer = new LinkedList<>();
        int capacity = 5;
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Runnable producer = () -> {
            for(int i=0; i<1000000; i++) {
                synchronized (buffer) {
                    if (buffer.size() == capacity) {
                        try {
                            System.out.println("Buffer full. Producer waiting.");
                            buffer.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            return;
                        }
                    }
                    buffer.add(i);
                    System.out.println("Produced " + i);
                    buffer.notifyAll();
                }
            }
        };
        Runnable consumer = () -> {
            while(true){
                synchronized (buffer) {
                    while (buffer.isEmpty()) {
                        try {
                            System.out.println("Buffer empty. Consumer waiting.");
                            buffer.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            return;
                        }
                    }
                    System.out.println("Consumed " + buffer.poll());
                    buffer.notifyAll();
                }
            }
        };
        Thread prod = new Thread(producer);
        Thread cons = new Thread(consumer);
        prod.start();
        cons.start();
//        executorService.submit(producer);
//        executorService.submit(consumer);
//        try {
//            Thread.sleep(10000); // Run for 10 seconds
//        } catch (InterruptedException e) {
//            Thread.currentThread().interrupt();
//        }
//        executorService.shutdownNow();
    }
}
