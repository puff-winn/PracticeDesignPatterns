package com.builderPattern.components;

public class Wall {
    private String color;
    private int length;
    private int height;

    // Getters
    public String getColor() {
        return color;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Wall{" +
                "color='" + color + '\'' +
                ", length=" + length +
                ", height=" + height +
                '}';
    }
}
