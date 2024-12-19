package com.builderPattern.components;

public class Window {

    private int length;

    private int height;

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Window{" +
                "length=" + length +
                ", height=" + height +
                '}';
    }
}

