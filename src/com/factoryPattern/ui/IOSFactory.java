package com.factoryPattern.ui;

import com.factoryPattern.components.button.Button;
import com.factoryPattern.components.button.IOSButton;
import com.factoryPattern.components.dropdown.Dropdown;
import com.factoryPattern.components.dropdown.IOSDropdown;
import com.factoryPattern.components.menu.IOSMenu;
import com.factoryPattern.components.menu.Menu;

public class IOSFactory implements UIFactory{
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
