package com.factory.ui;

import com.factory.components.button.Button;
import com.factory.components.dropdown.Dropdown;
import com.factory.components.menu.Menu;

public interface UIFactory {

    Menu createMenu();
    Button createButton();
    Dropdown createDropdown();

}
