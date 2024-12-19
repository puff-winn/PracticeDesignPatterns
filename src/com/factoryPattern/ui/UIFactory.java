package com.factoryPattern.ui;

import com.factoryPattern.components.button.Button;
import com.factoryPattern.components.dropdown.Dropdown;
import com.factoryPattern.components.menu.Menu;

public interface UIFactory {

    Menu createMenu();
    Button createButton();
    Dropdown createDropdown();
}
