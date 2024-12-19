package com.builderPattern.director;

import com.builderPattern.builder.HouseBuilder;

public class HouseDirector implements Director{

    HouseBuilder houseBuilder;

    public HouseDirector(){
        houseBuilder = new HouseBuilder();
    }
    @Override
    public Object construct() {
//        houseBuilder.setRooms();
        return null;
    }

}
