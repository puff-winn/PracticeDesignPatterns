package com.builderPattern.builder;

import com.builderPattern.components.Window;

public class WindowBuilder {

    private Window window;

    public WindowBuilder(){
        window = new Window();
    }

    public WindowBuilder setLength(int length){
        window.setLength(length);
        return this;
    }

    public WindowBuilder setHeight(int height){
        window.setHeight(height);
        return this;
    }

    public Window build(){
        return window;
    }
}
