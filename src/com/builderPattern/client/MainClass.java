package com.builderPattern.client;

import com.builderPattern.builder.DoorBuilder;
import com.builderPattern.components.Door;
import com.builderPattern.components.Room;
import com.builderPattern.director.DoorDirector;
import com.builderPattern.director.RoomDirector;

public class MainClass {

    public static void main(String[] args){
        RoomDirector roomDirector = new RoomDirector();
        Room room = roomDirector.construct();
        System.out.println(room.toString());
    }
}
