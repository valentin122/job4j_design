package lsp.menu;

import lsp.menu.actions.Action;
import lsp.menu.actions.AddItem;
import lsp.menu.actions.RemoveItem;
import lsp.menu.gui.ConsolePrinter;
import lsp.menu.model.Item;
import lsp.menu.model.MenuItem;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Action> actions = Arrays.asList(new AddItem(), new RemoveItem());

        ConsolePrinter consolePrinter = new ConsolePrinter();

        List<Item> menuList = Arrays.asList(
                new MenuItem(Arrays.asList(new MenuItem("Задача 1.1.", actions),
                        new MenuItem("Задача 1.2.", actions)),
                        "Задача 1.", actions),
                new MenuItem("Задача 2.", actions),
                new MenuItem("Задача 3.", actions),
                new MenuItem("Задача 4.", actions) );
        MenuItem menu = new MenuItem(menuList, "Menu", actions);


        consolePrinter.printAll(menu);


    }
}
