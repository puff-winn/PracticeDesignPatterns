package com.factoryPattern.ui;

import com.factoryPattern.components.button.AndroidButton;
import com.factoryPattern.components.button.Button;
import com.factoryPattern.components.dropdown.AndroidDropdown;
import com.factoryPattern.components.dropdown.Dropdown;
import com.factoryPattern.components.menu.AndroidMenu;
import com.factoryPattern.components.menu.Menu;

public class AndroidFactory implements UIFactory{
    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
    }
}
