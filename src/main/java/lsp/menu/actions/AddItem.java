package lsp.menu.actions;

public class AddItem implements Action {
    private String name = "Add new menu item.";

    public String getName() {
        return name;
    }

    @Override
    public boolean execute() {
        return false;
    }
}
