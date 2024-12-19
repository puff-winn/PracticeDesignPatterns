package com.builderPattern.builder;

import com.builderPattern.components.Door;
import com.builderPattern.components.Room;
import com.builderPattern.components.Wall;
import com.builderPattern.components.Window;

import java.util.List;

public class RoomBuilder {

    private Room room;

    public RoomBuilder(){
        room = new Room();
    }

    public RoomBuilder setWalls(List<Wall> walls){
        room.setWalls(walls);
        return this;
    }

    public RoomBuilder setCeiling(Wall wall){
        room.setCeiling(wall);
        return this;
    }

    public RoomBuilder setWindows(Window window){
        room.setWindow(window);
        return this;
    }

    public RoomBuilder setDoors(Door door){
        room.setDoor(door);
        return this;
    }

    public Room build(){
        return room;
    }

}
