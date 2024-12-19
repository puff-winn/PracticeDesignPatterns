package com.builderPattern.director;

import com.builderPattern.builder.WallBuilder;
import com.builderPattern.components.Wall;

public class WallDirector implements Director{

    private WallBuilder wallBuilder;

    public WallDirector() {
        wallBuilder = new WallBuilder();
    }

    @Override
    public Wall construct() {
        return wallBuilder.setColor("Red")
                .setHeight(40)
                .setLength(50)
                .build();
    }

    public Wall constructAbstractWall(Object ...args){
        return wallBuilder.setColor(args.length>0 && args[0] instanceof String ? args[0].toString():"White")
                .setHeight(args.length>1 && args[1] instanceof Number ? Integer.parseInt(String.valueOf(args[1])):50)
                .setLength(args.length>2 && args[2] instanceof Number ? Integer.parseInt(String.valueOf(args[2])):50)
                .build();
    }
}
