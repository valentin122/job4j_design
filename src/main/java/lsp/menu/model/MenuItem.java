package lsp.menu.model;

import lsp.menu.actions.Action;

import java.util.ArrayList;
import java.util.List;

public class MenuItem implements Item {
    private List<Item> children = new ArrayList<>();
    private String name;
    private List<Action> actions;

    public MenuItem(String name) {
        this.name = name;
    }

    public MenuItem(List<Item> children, String name, List<Action> actions) {
        this.children = children;
        this.name = name;
        this.actions = actions;
    }

    public MenuItem(String name, List<Action> actions) {
        this.name = name;
        this.actions = actions;
    }

    public List<Action> getActions() {
        return actions;
    }

    @Override
    public List<Item> getChildren() {
        return children;
    }

    public String getName() {
        return name;
    }

}
