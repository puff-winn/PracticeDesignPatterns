package com.factory.ui;

public class Flutter {

    private SupportedPlatform platform;

    public Flutter(SupportedPlatform platform){
        this.platform = platform;
    }

    public void setTheme(){
        System.out.println("Setting the theme");
    }

    public void setRefreshRate(){
        System.out.println("Setting refresh rate");
    }

    public UIFactory createUIFactory(){
        return UIFactoryFactory.createUIFactory(platform);
    }

}
