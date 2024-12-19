package com.builderPattern.builder;

import com.builderPattern.components.Wall;

public class WallBuilder {

    private Wall wall;

    public WallBuilder(){
        wall = new Wall();
    }

    public WallBuilder setLength(int length){
        wall.setLength(length);
        return this;
    }

    public WallBuilder setHeight(int height){
        wall.setHeight(height);
        return this;
    }

    public WallBuilder setColor(String color){
        wall.setColor(color);
        return this;
    }

    public Wall build(){
        return wall;
    }

}
