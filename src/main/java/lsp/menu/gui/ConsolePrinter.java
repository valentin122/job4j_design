package lsp.menu.gui;

import lsp.menu.model.Item;

import java.util.LinkedList;

public class ConsolePrinter implements Printer {

    @Override
    public void printAll(Item root) {
        LinkedList<Item> queue = new LinkedList<>();
        queue.addAll(root.getChildren());
        while (!queue.isEmpty()) {
            Item item = queue.poll();
            System.out.println(item.getName());
            queue.addAll(0, item.getChildren());
        }
    }
}
