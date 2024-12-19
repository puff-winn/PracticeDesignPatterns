package com.builderPattern.components;

import java.util.List;

public class Room {
    private List<Wall> walls;
    private Wall ceiling;
    private Window window;
    private Door door;

    // Getters
    public List<Wall> getWalls() {
        return walls;
    }

    public Wall getCeiling() {
        return ceiling;
    }

    public Window getWindow() {
        return window;
    }

    public Door getDoor() {
        return door;
    }

    public void setWalls(List<Wall> walls) {
        this.walls = walls;
    }

    public void setCeiling(Wall ceiling) {
        this.ceiling = ceiling;
    }

    public void setWindow(Window window) {
        this.window = window;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    @Override
    public String toString() {
        return "Room{" +
                "walls=" + walls +
                ", ceiling=" + ceiling +
                ", window=" + window +
                ", door=" + door +
                '}';
    }
}
