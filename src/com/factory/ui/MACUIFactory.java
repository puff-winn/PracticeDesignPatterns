package com.factory.ui;

import com.factory.components.button.Button;
import com.factory.components.button.MACButton;
import com.factory.components.dropdown.Dropdown;
import com.factory.components.dropdown.MACDropdown;
import com.factory.components.menu.MACMenu;
import com.factory.components.menu.Menu;

public class MACUIFactory implements UIFactory{
    @Override
    public Menu createMenu() {
        return new MACMenu();
    }

    @Override
    public Button createButton() {
        return new MACButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new MACDropdown();
    }
}
