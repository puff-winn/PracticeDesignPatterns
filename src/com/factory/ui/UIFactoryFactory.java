package com.factory.ui;

public class UIFactoryFactory {

    public static UIFactory createUIFactory(SupportedPlatform platform){
        return switch (platform){
            case ANDROID -> new AndroidUIFactory();
            case IOS -> new IOSUIFactory();
            case MAC -> new MACUIFactory();
            case WINDOWS -> new WindowsUIFactory();
        };
    }
}
