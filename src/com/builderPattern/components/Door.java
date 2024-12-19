package com.builderPattern.components;

public class Door {
    private TypeOfDoor type;
    private int height;
    private int width;

    // Getters
    public TypeOfDoor getType() {
        return type;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    // Setters
    public void setType(TypeOfDoor type) {
        this.type = type;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Door{" +
                "type=" + type +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
