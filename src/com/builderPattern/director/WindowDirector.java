package com.builderPattern.director;

import com.builderPattern.builder.WindowBuilder;
import com.builderPattern.components.Window;

public class WindowDirector implements Director{

    private WindowBuilder windowBuilder;

    public WindowDirector() {
        windowBuilder = new WindowBuilder();
    }

    @Override
    public Window construct() {
        return windowBuilder.setLength(10)
                .setHeight(6)
                .build();
    }
}
