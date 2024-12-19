package com.producerConsumer.waitNotifySepClass;

import java.util.LinkedList;
import java.util.Queue;

public class MainClass {

    public static void main(String[] args) {

    }
}

class SharedData {

    Queue<Integer> strings;
    int capacity;

    SharedData(int cap){
        strings = new LinkedList<>();
        capacity = cap;
    }
}

class Producer implements Runnable {


    @Override
    public void run() {

    }
}

class Consumer implements Runnable {


    @Override
    public void run() {

    }
}
