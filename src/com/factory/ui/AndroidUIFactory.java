package com.factory.ui;

import com.factory.components.button.AndroidButton;
import com.factory.components.button.Button;
import com.factory.components.dropdown.AndroidDropdown;
import com.factory.components.dropdown.Dropdown;
import com.factory.components.menu.AndroidMenu;
import com.factory.components.menu.Menu;

public class AndroidUIFactory implements UIFactory{
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
