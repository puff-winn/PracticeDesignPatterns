package com.bridgePattern.client;

import com.bridgePattern.components.*;

public class MainClass {

    public static void main(String[] args) {
        testDevice(new RadioDevice());
        testDevice(new TVDevice());
    }

    public static void testDevice(Device device){
        System.out.println("Testing with basic remote - ");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
