package com.builderPattern.builder;

import com.builderPattern.components.House;
import com.builderPattern.components.Room;

import java.util.List;

public class HouseBuilder {

    private House myHouse;

    public HouseBuilder(){
        myHouse = new House();
    }

    public HouseBuilder setRooms(List<Room> rooms){
        myHouse.setRooms(rooms);
        return this;
    }

    public HouseBuilder hasGarage(){
        myHouse.setHasGarage(true);
        return this;
    }

    public HouseBuilder hasStairs(){
        myHouse.setHasStairs(true);
        return this;
    }

    public House build(){
        return myHouse;
    }
}
