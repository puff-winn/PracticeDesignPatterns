package com.factory.ui;

import com.factory.components.button.Button;
import com.factory.components.button.IOSButton;
import com.factory.components.dropdown.Dropdown;
import com.factory.components.dropdown.IOSDropdown;
import com.factory.components.menu.IOSMenu;
import com.factory.components.menu.Menu;

public class IOSUIFactory implements UIFactory{
    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }

    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new IOSDropdown();
    }
}
