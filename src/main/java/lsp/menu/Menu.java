package lsp.menu;

import lsp.menu.model.Item;

import java.util.List;

public class Menu implements lsp.menu.core.Menu {
    private List<Item> menuItems;

    public Menu(List<Item> menuItems) {
        this.menuItems = menuItems;
    }

    public void showMenu(List<Item> menuItems) {

    }
}
