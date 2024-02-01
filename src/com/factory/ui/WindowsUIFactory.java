package com.factory.ui;

import com.factory.components.button.Button;
import com.factory.components.button.WindowsButton;
import com.factory.components.dropdown.Dropdown;
import com.factory.components.dropdown.WindowsDropdown;
import com.factory.components.menu.Menu;
import com.factory.components.menu.WindowsMenu;

public class WindowsUIFactory implements UIFactory{
    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new WindowsDropdown();
    }
}
