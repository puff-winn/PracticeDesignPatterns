package com.builderPattern.director;

import com.builderPattern.builder.DoorBuilder;
import com.builderPattern.components.Door;
import com.builderPattern.components.TypeOfDoor;

public class DoorDirector implements Director{

    private DoorBuilder doorBuilder;

    public DoorDirector(){
        this.doorBuilder = new DoorBuilder();
    }

    @Override
    public Door construct(){
        return doorBuilder.setHeight(30)
                .setWidth(10)
                .setType(TypeOfDoor.WOOD)
                .build();
    }
}
