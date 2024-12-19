package com.factoryPattern.main;

import com.factoryPattern.ui.Platform;
import com.factoryPattern.ui.UIFactory;
import com.factoryPattern.ui.UIFactoryHandler;

public class MainClass {

    public static void main(String[] args) {
        UIFactory uiFactory = UIFactoryHandler.createUIFactory(Platform.ANDROID);
        uiFactory.createMenu();
        uiFactory.createButton();
        uiFactory.createDropdown();
    }
}
