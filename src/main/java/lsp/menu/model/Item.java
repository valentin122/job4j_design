package lsp.menu.model;

import java.util.List;

public interface Item {
    public List<Item> getChildren();
    public String getName();

}
