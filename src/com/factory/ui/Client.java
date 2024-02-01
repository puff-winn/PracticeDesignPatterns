package com.factory.ui;

import com.factory.components.button.Button;
import com.factory.components.dropdown.Dropdown;
import com.factory.components.menu.Menu;

public class Client {

    public static void main(String args[]){
        // 1 change will change it from ANDROID to IOS
        Flutter flutter = new Flutter(SupportedPlatform.MAC);
        UIFactory uiFactory = flutter.createUIFactory();
        Menu menu = uiFactory.createMenu();
        Button button = uiFactory.createButton();
        Dropdown dropdown = uiFactory.createDropdown();

    }
}
