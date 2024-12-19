package com.builderPattern.director;

import com.builderPattern.builder.RoomBuilder;
import com.builderPattern.components.Door;
import com.builderPattern.components.Room;
import com.builderPattern.components.Wall;
import com.builderPattern.components.Window;

import java.util.ArrayList;
import java.util.List;

public class RoomDirector implements Director{

    private RoomBuilder roomBuilder;

    public RoomDirector() {
        roomBuilder = new RoomBuilder();
    }

    @Override
    public Room construct() {
        Door door = constructDoor();
        List<Wall> walls = new ArrayList<>(List.of(constructWall(),constructWall(),constructWall(),constructWall()));
        Wall ceiling = constructWall("White", 30, 30);
        Window window = constructWindow();
        return roomBuilder.setCeiling(ceiling)
                .setWalls(walls)
                .setDoors(door)
                .setWindows(window)
                .build();
    }

    public Door constructDoor(){
        DoorDirector doorDirector = new DoorDirector();
        return doorDirector.construct();
    }

    public Window constructWindow(){
        WindowDirector windowDirector = new WindowDirector();
        return windowDirector.construct();
    }

    public Wall constructWall(Object ...args){
        WallDirector wallDirector = new WallDirector();
        if(args.length==0)
            return wallDirector.construct();
        else
            return wallDirector.constructAbstractWall(args);
    }
}
