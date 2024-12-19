package com.builderPattern.components;

import java.util.List;

public class House {
    private List<Room> rooms;
    private Boolean hasGarage;
    private Boolean hasStairs;

    // Getters
    public List<Room> getRooms() {
        return rooms;
    }

    public Boolean getHasGarage() {
        return hasGarage;
    }

    public Boolean getHasStairs() {
        return hasStairs;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public void setHasGarage(Boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    public void setHasStairs(Boolean hasStairs) {
        this.hasStairs = hasStairs;
    }

    @Override
    public String toString() {
        return "House{" +
                "rooms=" + rooms +
                ", hasGarage=" + hasGarage +
                ", hasStairs=" + hasStairs +
                '}';
    }
}
