package com.factoryPattern.ui;

public class UIFactoryHandler {

    public UIFactoryHandler() {
    }

    public static UIFactory createUIFactory(Platform platform){
        UIFactory uiFactory;
        switch (platform){
            case ANDROID :
                uiFactory = new AndroidFactory();
                break;
            case IOS :
                uiFactory = new IOSFactory();
                break;
            default:
                throw new IncompatibleClassChangeError();
        }
        return uiFactory;
    }
}
