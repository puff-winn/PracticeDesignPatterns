package com.builderPattern.builder;

import com.builderPattern.components.Door;
import com.builderPattern.components.TypeOfDoor;

public class DoorBuilder {

    private Door door;

    public DoorBuilder(){
        door = new Door();
    }

    public DoorBuilder setHeight(int height){
        door.setHeight(height);
        return this;
    }

    public DoorBuilder setWidth(int width){
        door.setWidth(width);
        return this;
    }

    public DoorBuilder setType(TypeOfDoor type){
        door.setType(type);
        return this;
    }

    public Door build(){
        return door;
    }
}
